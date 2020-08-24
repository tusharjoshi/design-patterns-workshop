package com.company.example.expression;

import java.util.*;

// tag::source[]
public class VariableNode extends AbstractNode {
    public NodeTokens getType() {
        return NodeTokens.VARIABLE;
    }

    public Double interprete(IContext context, INotification notification) {
        Double value = context.getValue(getName());
        if( value == null) {
            notification.add(String.format("No value for variable %s found.", getName()));
            throw new RuntimeException();
        }
        return value;
    }
}
// end::source[]