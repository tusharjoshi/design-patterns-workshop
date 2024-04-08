package com.company.example;

import com.company.example.expression.*;

import java.util.*;

// tag::source[]
public class Evaluator {
    private IContext context;
    private INotification notification;

    public Evaluator(IContext context, INotification notification) {
        this.context = context;
        this.notification = notification;
    }
    public Double evaluate(String expression) {
        List<String> tokenList = new Tokenizer().tokenize(expression);
        IExpressionNode node = new ExpressionBuilder(notification).build(tokenList);
        return node.interprete(context, notification);
    }
}
// end::source[]