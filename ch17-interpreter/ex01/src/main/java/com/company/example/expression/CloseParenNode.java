package com.company.example.expression;

import java.util.*;

// tag::source[]
public class CloseParenNode extends AbstractNode {
    public NodeTokens getType() {
        return NodeTokens.CLOSEPAREN;
    }
}
// end::source[]