package com.company.example.expression;

import java.util.*;

// tag::source[]
public class RaisedtoNode extends AbstractNode {
    public NodeTokens getType() {
        return NodeTokens.RAISEDTO;
    }

    public Double interprete(IContext context, INotification notification) {
        System.out.println("Left:"+leftNode.getType());
        System.out.println("Left:"+rightNode.getType());
        return Math.pow(
            leftNode.interprete(context, notification),
            rightNode.interprete(context, notification)
        );
    }
}
// end::source[]