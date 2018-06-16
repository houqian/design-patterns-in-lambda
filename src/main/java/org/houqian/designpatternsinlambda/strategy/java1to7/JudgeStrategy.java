package org.houqian.designpatternsinlambda.strategy.java1to7;

/**
 * 阈值判定策略模式实现
 *
 * @author  : houqian
 * @since  : 17/4/14
 * @version  : 1.0
 */
public interface JudgeStrategy {

  /**
   * 判定
   *
   * @param jp@return
   */
  Boolean doJuddge(JudgeParam jp);
}
