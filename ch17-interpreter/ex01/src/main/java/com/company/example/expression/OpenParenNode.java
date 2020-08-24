package com.company.example.expression;

import java.util.*;

// tag::source[]
public class OpenParenNode extends AbstractNode {
    public NodeTokens getType() {
        return NodeTokens.OPENPAREN;
    }
}
// end::source[]