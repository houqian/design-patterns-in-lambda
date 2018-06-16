package org.houqian.designpatternsinlambda.strategy.java1to7;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * 阈值判定传参对象
 *
 * <pre>
 *   Useage:
 *
 *   设值:
 *   JudgeParam jp = JudgeParam.builder().max(111d).build();
 *   取值:
 *   Double max = jp.getMax();
 * </pre>
 *
 * @author  : houqian
 * @since  : 17/4/14
 * @version  : 1.0
 */
@Builder
@ToString
public class JudgeParam {

  /** 阈值区间下界 */
  @Getter
  private Double min;

  /** 阈值区间上界 */
  @Getter
  private Double max;

  /** 实际值 */
  @Getter
  private Double value;

  /** 实际分子 */
  @Getter
  private Double numerator;

  /** 实际分母 */
  @Getter
  private Double divisor;
}
