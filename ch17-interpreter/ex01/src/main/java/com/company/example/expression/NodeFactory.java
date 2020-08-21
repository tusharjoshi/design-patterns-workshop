package com.company.example.expression;

import java.util.*;

// tag::source[]
public class NodeFactory {
    public static IExpressionNode create(String token) {
        IExpressionNode node;
        switch(token) {
            case "plus":
                node = new PlusNode();
                break;
            case "minus":
                node = new MinusNode();
                break;
            case "by":
                node = new ByNode();
                break;
            case "times":
                node = new TimesNode();
                break;
            case "raisedto":
                node = new RaisedtoNode();
                break;
            case "(":
                node = new OpenParenNode();
                break;
            case ")":
                node = new CloseParenNode();
                break;
            default:
                Double value = null;
                try {
                    value = Double.parseDouble(token);
                    node = new ValueNode();
                    node.setName(token);
                } catch(Exception ex) {
                    node = new VariableNode();
                    node.setName(token);
                }
                break;
        }
        return node;
    }
}
// end::source[]