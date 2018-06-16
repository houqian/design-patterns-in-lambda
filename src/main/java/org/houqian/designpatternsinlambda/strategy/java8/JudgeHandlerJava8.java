package org.houqian.designpatternsinlambda.strategy.java8;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author : houqian
 * @version : 1.0
 * @since : 2018/6/16
 */
@Slf4j
@Component
public class JudgeHandlerJava8 {

  private List<Function<JudgeParam, Boolean>> judgeStrategyList = null;

  private Function<JudgeParam, Boolean> judgeHandler = null;

  @PostConstruct
  private void initJudgeStratege() {
    this.judgeStrategyList = initStrategy();
    this.judgeHandler = initJudgeHandler();
  }

  private List<Function<JudgeParam, Boolean>> initStrategy() {
    Function<JudgeParam, Boolean> ceilJudgeStrategy = (JudgeParam jp) -> {
      Double max = jp.getMax();
      Double value = jp.getValue();
      boolean result = value >= max;
      log.info("ceilJudgeStrategy result:{}", result);
      return result;
    };

    Function<JudgeParam, Boolean> numeratorLessThanXStrategy = (JudgeParam jp) -> {
      Double numerator = jp.getNumerator();
      Double divisor = jp.getDivisor();
      boolean result = numerator > 3 && divisor > 3;
      log.info("numeratorLessThanXStrategy result:{}", result);
      return result;
    };

    Function<JudgeParam, Boolean> zeroJudgeStrategy = (JudgeParam jp) -> {
      Double max = jp.getMax();
      Double min = jp.getMin();
      Double value = jp.getValue();
      boolean result = !(max == 0 && min == 0 && value == 0);
      log.info("zeroJudgeStrategy result:{}", result);
      return result;
    };

    return Arrays.asList(
            ceilJudgeStrategy,
            numeratorLessThanXStrategy,
            zeroJudgeStrategy
    );
  }

  private Function<JudgeParam, Boolean> initJudgeHandler() {
    return (JudgeParam jp) -> judgeStrategyList.stream()
            .map(js -> {
              Boolean judgeResult = js.apply(jp);
              if (judgeResult.equals(Boolean.FALSE))  // 若有策略不满足,则不告警
                return Boolean.FALSE;
              else
                return Boolean.TRUE;
            }).allMatch(r -> r.equals(Boolean.TRUE));
  }

  public Boolean handle(JudgeParam jp) {
    return this.judgeHandler.apply(jp);
  }
}
