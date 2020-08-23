package com.company.example;

import java.util.*;

// tag::source[]
public class Calculator {
    private Display display;
    private Button one;
    private Button zero;
    private Button plus;
    private Button minus;
    private Button equalTo;
    private Button undo;
    private Button redo;
    private String previousNumberText = "";
    private String currentNumberText = "";
    private String operator = null;
    private Stack<Command> undoStack = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();

    public Calculator() {
        display = new Display(this);
        one = new Button(this, "1");
        zero = new Button(this, "0");
        plus = new Button(this, "plus");
        minus = new Button(this, "minus");
        equalTo = new Button(this, "=");
        undo = new Button(this, "undo");
        redo = new Button(this, "redo");
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

    public Button getUndo() {
        return undo;
    }

    public Button getRedo() {
        return redo;
    }

    public Display getDisplay() {
        return display;
    }

    public void onCommand(String title) {
        switch(title) {
            case "undo":
                undo();
                break;
            case "redo":
                redo();
                break;
            default:
                addCommand(title);
                onClick(title);
                break;
        }
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

    private void addCommand(String title) {
        undoStack.push(new Command(this, title));
        redoStack.clear();
    }

    private void undo() {
        if( !undoStack.empty()) {
            redoStack.push(undoStack.pop());
            replay();
        }
    }

    private void redo() {
        if( !redoStack.empty()) {
            Command command = redoStack.pop();
            undoStack.push(command);
            command.execute();
        }
    }

    private void replay() {
        reset();
        if( !undoStack.empty()) {
            for(Command command : undoStack) {
                command.execute();
            }
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