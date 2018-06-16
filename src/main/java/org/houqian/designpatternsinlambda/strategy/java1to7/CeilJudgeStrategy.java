package org.houqian.designpatternsinlambda.strategy.java1to7;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 基于阈值上限判定;满足条件:实际值大于阈值
 *
 * @author  : houqian
 * @since  : 17/4/14
 * @version  : 1.0
 */
@Slf4j
@Component
public class CeilJudgeStrategy implements JudgeStrategy {

  @Override
  public Boolean doJuddge(JudgeParam jp) {
    Double max = jp.getMax();
    Double value = jp.getValue();
    boolean result = value >= max;
    log.info("{} result:{}", getClass().getName(), result);
    return result;
  }

}
