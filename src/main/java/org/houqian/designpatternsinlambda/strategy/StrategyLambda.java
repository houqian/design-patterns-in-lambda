package org.houqian.designpatternsinlambda.strategy;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import static java.lang.System.out;

/**
 * @author : houqian
 * @version : 1.0
 * @since : 2018/6/17
 */
public class StrategyLambda {

  public static void publishText(String text,
                                 Predicate<String> filter,
                                 UnaryOperator<String> format) {
    if (filter.test(text)) {
      out.println(format.apply(text));
    }
  }

  private static Map<Predicate<String>, UnaryOperator<String>> ruleActions;

  static {
    ruleActions = new HashMap<>();

    // 即使lambda表达式形式相同，可依然会生成不同的函数对象
    ruleActions.put(s -> s.contains("ERROR"), String::toUpperCase);
    ruleActions.put(s -> s.contains("ERROR"), s -> s + "6666666");
    ruleActions.put(s -> s.length() < 20, String::toLowerCase);
    ruleActions = Collections.unmodifiableMap(ruleActions);

    out.println("=====rule & action=====");
    ruleActions.forEach((rule, action) -> {
      out.print("rule: " + rule + ",");
      out.println("action: " + action + ".");
    });
    out.println("=====rule & action=====");
  }

  public static void publishText(String text) {
    ruleActions.forEach((rule, action) -> {
      if (rule.test(text)) {
        out.println(action.apply(text));
      }
    });
  }


  public static void main(String[] args) {
    publishText("ERROR - something bad happened", s -> s.contains("ERROR"), String::toUpperCase);
    publishText("DEBUG - I'm here", s -> s.length() < 20, String::toLowerCase);
    out.println("==============================================");
    publishText("ERROR - something bad happened");
    publishText("DEBUG - I'm here");

  }
}