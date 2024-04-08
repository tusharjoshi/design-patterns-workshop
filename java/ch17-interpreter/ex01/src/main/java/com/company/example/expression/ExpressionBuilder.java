package com.company.example.expression;

import java.util.*;

// tag::source[]
public class ExpressionBuilder {
    private Stack<IExpressionNode> stack = new Stack<>();
    private IExpressionNode currentRoot = null;
    private IExpressionNode nextNode = null;
    private INotification notification;

    public ExpressionBuilder(INotification notification) {
        this.notification = notification;
    }

    public IExpressionNode build(List<String> tokenList) {
        for(String token : tokenList) {
            nextNode = NodeFactory.create(token);
            if( nextNode.getType() == NodeTokens.OPENPAREN) {
                processOpenParen();
            } else if( nextNode.getType() == NodeTokens.CLOSEPAREN) {
                processCloseParen();
            } else if( nextNode.getType() == NodeTokens.VARIABLE) {
                processVariable();
            } else {
                processBinaryRight();
            }
        }
        verifyStackEmpty();
        return currentRoot;
    }

    private void processOpenParen() {
        if( currentRoot != null) {
            stack.push(currentRoot);
            currentRoot = null;
        }
        stack.push(nextNode);
        nextNode = null;
    }

    private void processCloseParen() {
        verifyStackNotEmptyForCloseParen();
        ensureOpenParenInStack();
        if(!stack.empty()) {
            if( stack.peek().getType() != NodeTokens.OPENPAREN) {
                nextNode = currentRoot;
                currentRoot = stack.pop();
                currentRoot.setRightNode(nextNode);
            }
        }
    }

    private void processVariable() {
        if( currentRoot != null) {
            ensureNoVariableAgain();
            currentRoot.setRightNode(nextNode);
        } else {
            currentRoot = nextNode;
        }
    }

    private void processBinaryRight() {
        nextNode.setLeftNode(currentRoot);
        currentRoot = nextNode;
    }

    private void verifyStackEmpty() {
        if(!stack.empty()) {
            notification.add("Mismatched open paren.");
            throw new RuntimeException("Mismatched open paren.");
        }
    }

    private void verifyStackNotEmptyForCloseParen() {
        if(stack.empty()) {
            notification.add("Mismatched close paren.");
            throw new RuntimeException("Mismatched close paren.");
        }
    }

    private void ensureOpenParenInStack() {
        IExpressionNode node = stack.pop();
        if( node.getType() != NodeTokens.OPENPAREN) {
            notification.add("Mismatched close paren.");
            throw new RuntimeException("Mismatched close paren.");
        }
    }

    private void ensureNoVariableAgain() {
        if(currentRoot.getType() == NodeTokens.VARIABLE) {
            notification.add("Two variables cannot be consecutive");
            throw new RuntimeException("Two variables cannot be consecutive");
        }
    }
}
// end::source[]