package org.houqian.designpatternsinlambda.strategy.java8;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author : houqian
 * @version : 1.0
 * @since : 2018/6/16
 */
@Slf4j
public class Main2WithoutSpring {
//  private static Function<JudgeParam, Boolean> normalJudgeHandler;
//
//  static {
//    Function<JudgeParam, Boolean> ceilJudgeStrategy = (JudgeParam jp) -> {
//      Double max = jp.getMax();
//      Double value = jp.getValue();
//      boolean result = value >= max;
//      log.info("ceilJudgeStrategy result:{}", result);
//      return result;
//    };
//
//    Function<JudgeParam, Boolean> numeratorLessThanXStrategy = (JudgeParam jp) -> {
//      Double numerator = jp.getNumerator();
//      Double divisor = jp.getDivisor();
//      boolean result = numerator > 3 && divisor > 3;
//      log.info("numeratorLessThanXStrategy result:{}", result);
//      return result;
//    };
//
//    Function<JudgeParam, Boolean> zeroJudgeStrategy = (JudgeParam jp) -> {
//      Double max = jp.getMax();
//      Double min = jp.getMin();
//      Double value = jp.getValue();
//      boolean result = !(max == 0 && min == 0 && value == 0);
//      log.info("zeroJudgeStrategy result:{}", result);
//      return result;
//    };
//
//    List<Function<JudgeParam, Boolean>> judgeStrategies = Arrays.asList(
//            ceilJudgeStrategy,
//            numeratorLessThanXStrategy,
//            zeroJudgeStrategy
//    );
//
//    normalJudgeHandler = (JudgeParam jp) -> judgeStrategies.stream()
//            .map(js -> {
//              Boolean judgeResult = js.apply(jp);
//              if (judgeResult.equals(Boolean.FALSE))  // 若有策略不满足,则不告警
//                return Boolean.FALSE;
//              else
//                return Boolean.TRUE;
//            }).allMatch(r -> r.equals(Boolean.TRUE));
//
//  }
//
//  public static boolean handle(JudgeParam jp) {
//    return normalJudgeHandler.apply(jp);
//  }
//
//  public static void main(String[] args) {
//    JudgeParam judgeParam = JudgeParam.builder().max(8.21).min(0.0).value(0.0).numerator(1000.00).divisor(0.00).build();
//    Boolean judgeResult = handle(judgeParam);
//    if (judgeResult) {
//      System.out.println("send alert email...");
//    }
//    else {
//      System.out.println("no need to send alert email..");
//    }
//  }

}
