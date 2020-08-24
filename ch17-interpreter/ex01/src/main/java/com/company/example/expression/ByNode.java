package com.company.example.expression;

import java.util.*;

// tag::source[]
public class ByNode extends AbstractNode {
    public NodeTokens getType() {
        return NodeTokens.BY;
    }

    public Double interprete(IContext context, INotification notification) {
        return leftNode.interprete(context, notification)
            / rightNode.interprete(context, notification);
    }
}
// end::source[]