package org.houqian.designpatternsinlambda.strategy.java1to7;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 针对值和阈值都是零的判定策略;满足条件:两者都不是0
 *
 * @author  : houqian
 * @since  : 17/4/14
 * @version  : 1.0
 */
@Slf4j
@Component
public class ZeroJudgeStrategy implements JudgeStrategy {

  @Override
  public Boolean doJuddge(JudgeParam jp) {
    Double max = jp.getMax();
    Double min = jp.getMin();
    Double value = jp.getValue();
    boolean result = !(max == 0 && min == 0 && value == 0);
    log.info("{} result:{}", getClass().getName(), result);
    return result;
  }

}
