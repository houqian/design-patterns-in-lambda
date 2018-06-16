package org.houqian.designpatternsinlambda.strategy.java1to7;

import lombok.extern.slf4j.Slf4j;
import org.houqian.designpatternsinlambda.strategy.java1to7.handler.JudgeHandler;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author : houqian
 * @version : 1.0
 * @since : 2018/6/16
 */
@Slf4j
@Component
public class Main1 {

  private JudgeHandler judgeHandler;

  public Main1(JudgeHandler judgeHandler) {
    this.judgeHandler = judgeHandler;
  }

  @PostConstruct
  public void test() {
    JudgeParam judgeParam = JudgeParam.builder().max(8.21).min(0.0).value(0.0).numerator(1000.00).divisor(0.00).build();
    log.info(judgeParam.toString());
    judgeHandler.handle(judgeParam);
  }

}
