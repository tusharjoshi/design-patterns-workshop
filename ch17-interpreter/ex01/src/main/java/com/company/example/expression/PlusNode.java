package com.company.example.expression;

import java.util.*;

// tag::source[]
public class PlusNode extends AbstractNode {
    public NodeTokens getType() {
        return NodeTokens.PLUS;
    }

    public Double interprete(IContext context, INotification notification) {
        return leftNode.interprete(context, notification) + rightNode.interprete(context, notification);
    }
}
// end::source[]