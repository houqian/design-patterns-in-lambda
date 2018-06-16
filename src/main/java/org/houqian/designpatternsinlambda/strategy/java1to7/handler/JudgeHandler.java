package org.houqian.designpatternsinlambda.strategy.java1to7.handler;


import org.houqian.designpatternsinlambda.strategy.java1to7.JudgeParam;

/**
 * 阈值判定处理器
 *
 * @author  : houqian
 * @since  : 17/4/14
 * @version  : 1.0
 */
public interface JudgeHandler {
  Boolean handle(JudgeParam jp);
}
