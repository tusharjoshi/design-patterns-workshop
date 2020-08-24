package com.company.example;

// tag::source[]
public class Calculator {
    private Display display;
    private Button one;
    private Button zero;
    private Button plus;
    private Button minus;
    private Button equalTo;
    private String previousNumberText = "";
    private String currentNumberText = "";
    private String operator = null;

    public Calculator() {
        display = new Display(this);
        one = new Button(this, "1");
        zero = new Button(this, "0");
        plus = new Button(this, "plus");
        minus = new Button(this, "minus");
        equalTo = new Button(this, "=");
    }

    public Button getOne() {
        return one;
    }

    public Button getZero() {
        return zero;
    }

    public Button getPlus() {
        return plus;
    }

    public Button getMinus() {
        return minus;
    }

    public Button getEqualTo() {
        return equalTo;
    }

    public Display getDisplay() {
        return display;
    }

    public void onClick(String title) {
        switch(title) {
        case "1":
        case "0":
            storeDigit(title);
            break;
        case "plus":
        case "minus":
            storeOperator(title);
            break;
        case "=":
            showResult();
            break;
        case "display":
            reset();
            break;
        default:
            break;
        }
    }

    private void storeDigit(String title) {
        if( operator == null ) {
            previousNumberText += title;
            display.setText(previousNumberText);
        } else {
            currentNumberText += title;
            display.setText(currentNumberText);
        }
    }

    private void storeOperator(String title) {
        if(operator != null ) {
            showResult();
        }
        operator = title;
    }

    private void reset() {
        previousNumberText = "";
        currentNumberText = "";
        operator = null;
        display.setText("");
    }

    private void showResult() {
        if(!isValidStateForResult())
            return;

        Integer num1 = Integer.parseInt(previousNumberText, 2);
        Integer num2 = Integer.parseInt(currentNumberText, 2);
        Integer result;
        if( operator.equals("plus")) {
            result = num1 + num2;
        } else {
            result = num1 + num2;
        }
        previousNumberText = Integer.toBinaryString(result);
        display.setText(previousNumberText);
        currentNumberText = "";
        operator = null;
    }

    private boolean isValidStateForResult() {
        if(previousNumberText == null || previousNumberText.length() == 0) {
            return false;
        }
        if(currentNumberText == null || currentNumberText.length() == 0) {
            return false;
        }
        if( operator == null) {
            return false;
        }

        return true;
    }
}
// end::source[]