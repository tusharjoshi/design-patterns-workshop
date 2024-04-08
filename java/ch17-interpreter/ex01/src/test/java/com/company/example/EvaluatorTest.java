package com.company.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.*;

// tag::source[]
class EvaluatorTest {

    private NotificationContext notificationContext;
    private VariableContext context;
    private Evaluator evaluator;

    private void assertList(List<String> expected, List<String> actual) {
        for(int index = 0 ; index < expected.size() ; index++) {
            assertEquals(expected.get(index), actual.get(index));
        }
    }

    @BeforeEach
    void beforeEach() {
        notificationContext = new NotificationContext();
        context = new VariableContext();
        evaluator = new Evaluator(context, notificationContext);
    }

    @Test
    void test_evaluate() {
        context.setValue("x", 4.0);
        String expression = "x plus ( 2 plus 3 minus 2 times 2 ) by 5";
        assertEquals(2.0, evaluator.evaluate(expression));
    }

    @Test
    void test_evaluate_precedence() {
        context.setValue("x", 4.0);
        String expression = "3 times ( ( x plus 2 ) )";
        assertEquals(18.0, evaluator.evaluate(expression));
    }

    @Test
    void test_evaluate_precedence2() {
        context.setValue("x", 4.0);
        String expression = "3 times x plus 2";
        assertEquals(14.0, evaluator.evaluate(expression));
    }

    @Test
    void test_evaluate_raisedto() {
        context.setValue("x", 4.0);
        String expression = "( x plus 2 ) raisedto 2";
        assertEquals(36.0, evaluator.evaluate(expression));
    }

    @Test
    void test_evaluate_polynomial() {
        context.setValue("x", 2.0);
        String expression = "x raisedto 2 plus ( 2 times x ) plus 1";
        assertEquals(9.0, evaluator.evaluate(expression));
    }

    @Test
    void test_evaluate_consecutive_variables() {
        try {
            context.setValue("x", 4.0);
            String expression = "3 2 plus x";
            evaluator.evaluate(expression);
        } catch(Exception ex) {
            String[] expected = {
                "Two variables cannot be consecutive"
            };
            assertList(Arrays.asList(expected), notificationContext.getList());
        }
    }

    @Test
    void test_evaluate_mismatched_openparen() {
        try {
            context.setValue("x", 4.0);
            String expression = "3 plus 2 ( x";
            evaluator.evaluate(expression);
        } catch(Exception ex) {
            String[] expected = {
                "Mismatched open paren."
            };
            assertList(Arrays.asList(expected), notificationContext.getList());
        }
    }

    @Test
    void test_evaluate_mismatched_closeparen() {
        try {
            context.setValue("x", 4.0);
            String expression = "3 plus 2 ) x";
            evaluator.evaluate(expression);
        } catch(Exception ex) {
            String[] expected = {
                "Mismatched close paren."
            };
            assertList(Arrays.asList(expected), notificationContext.getList());
        }
    }
}
// end::source[]