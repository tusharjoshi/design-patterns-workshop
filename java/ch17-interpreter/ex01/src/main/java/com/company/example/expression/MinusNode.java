package com.company.example.expression;

import java.util.*;

// tag::source[]
public class MinusNode extends AbstractNode {
    public NodeTokens getType() {
        return NodeTokens.MINUS;
    }

    public Double interprete(IContext context, INotification notification) {
        return leftNode.interprete(context, notification)
            - rightNode.interprete(context, notification);
    }
}
// end::source[]