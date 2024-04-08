package com.company.example.expression;

import java.util.*;

// tag::source[]
public class ValueNode extends AbstractNode {
    public NodeTokens getType() {
        return NodeTokens.VARIABLE;
    }

    public Double interprete(IContext context, INotification notification) {
        return Double.parseDouble(getName());
    }
}
// end::source[]