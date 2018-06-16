package org.houqian.designpatternsinlambda.strategy.java1to7;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 分子或分母小于3的情况业务方不予关注
 *
 * @author : houqian
 * @version : 1.0
 * @since : 17/7/24
 */
@Slf4j
@Component
public class NumeratorLessThanXStrategy implements JudgeStrategy {

  @Override
  public Boolean doJuddge(JudgeParam jp) {
    Double numerator = jp.getNumerator();
    Double divisor = jp.getDivisor();
    boolean result = numerator > 3 && divisor > 3;
    log.info("{} result:{}", getClass().getName(), result);
    return result;
  }

}
