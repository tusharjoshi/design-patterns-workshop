package com.company.example.expression;

import java.util.*;

// tag::source[]
public abstract class AbstractNode implements IExpressionNode {
    protected IExpressionNode leftNode;
    protected IExpressionNode rightNode;
    protected String name;
    protected Double value;

    public IExpressionNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(IExpressionNode leftNode) {
        this.leftNode = leftNode;
    }

    public IExpressionNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(IExpressionNode rightNode) {
        this.rightNode = rightNode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double interprete(IContext context, INotification notification) {
        throw new RuntimeException("AbstractNode method shall never be called.");
    }
}
// end::source[]