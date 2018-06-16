package org.houqian.designpatternsinlambda.strategy.java1to7.handler;


import org.houqian.designpatternsinlambda.strategy.java1to7.JudgeParam;
import org.houqian.designpatternsinlambda.strategy.java1to7.JudgeStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 * 基本判定处理器,负责执行判定策略集,满足所有策略条件则告警;反之,若有一个策略不满足,则不告警
 *
 * @author : houqian
 * @since  : 17/4/14
 * @version  : 1.0
 */
@Component
public class NormalJudgeHandler implements JudgeHandler {

    @Autowired
    List<JudgeStrategy> judgeStrategyList;

    @Override
    public Boolean handle(JudgeParam jp) {

        Boolean judgeResult;
        for (JudgeStrategy js : judgeStrategyList) {
            judgeResult = js.doJuddge(jp);

            if (judgeResult.equals(Boolean.FALSE))  // 若有策略不满足,则不告警
                return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

}
