package org.houqian.designpatternsinlambda;

import org.houqian.designpatternsinlambda.strategy.java8.JudgeHandlerJava8;
import org.houqian.designpatternsinlambda.strategy.java8.JudgeParam;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : houqian
 * @version : 1.0
 * @since : 2018/6/16
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = DesignPatternsInLambdaApplication.class)
public class TestJudgeHandlerJava8 {

  @Autowired
  private JudgeHandlerJava8 judgeHandlerJava8;

  @Test
  public void testHandle() {
    JudgeParam judgeParam = JudgeParam.builder().max(8.21).min(0.0).value(0.0).numerator(1000.00).divisor(0.00).build();
    this.judgeHandlerJava8.handle(judgeParam);
  }
}
