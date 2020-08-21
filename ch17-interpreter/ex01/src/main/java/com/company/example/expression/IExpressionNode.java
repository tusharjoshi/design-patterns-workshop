package com.company.example.expression;

import java.util.*;

// tag::source[]
public interface IExpressionNode {
    NodeTokens getType();
    IExpressionNode getLeftNode();
    void setLeftNode(IExpressionNode left);
    IExpressionNode getRightNode();
    void setRightNode(IExpressionNode right);
    String getName();
    void setName(String name);
    Double getValue();
    void setValue(Double value);
    Double interprete(IContext context, INotification notification);
}
// end::source[]