//Jonah Chegarnov

package calculator;// Importing the essential classes and packages for our calculator
import org.antlr.v4.runtime.*;
import gen.ReversePolishCalculatorLexer;
import gen.ReversePolishCalculatorParser;
import gen.ReversePolishCalculatorBaseListener;

import java.util.*; // importing utility classes like to use Stack and List

//creating our calculator class by extending ANTLR's base listener for the grammar
public class ReversePolishCalculator extends ReversePolishCalculatorBaseListener {
    private StringBuilder rpn = new StringBuilder(); //we will use rpn to store our Reverse Polish notation
    private Stack<String> operatorStack = new Stack<>(); //A stack to hold operators during conversion

    // we call this after expression to clean up any remaining operators.
    @Override
    public void exitExpression(ReversePolishCalculatorParser.ExpressionContext ctx) {
        while (!operatorStack.isEmpty()) {
            rpn.append(operatorStack.pop()).append(" "); // Popping the remaining operators into RPN
        }
    }

    // These methods handle operators, and is done by popping off higher precedence operators and pushing the new ones
    @Override
    public void exitTerm(ReversePolishCalculatorParser.TermContext ctx) {
        handleOperator("+-"); //This handles addition and subtraction
    }

    @Override
    public void exitFactor(ReversePolishCalculatorParser.FactorContext ctx) {
        handleOperator("*/"); //And this one handles multiplication and division
    }

    //once we are exiting a base element, we determine what kind of token we have and act on that token.
    @Override
    public void exitBase(ReversePolishCalculatorParser.BaseContext ctx) {
        // We check for different types of tokens and add them to our RPN string
        if (ctx.NUMBER() != null) {
            rpn.append(ctx.NUMBER().getText()).append(" ");
        } else if (ctx.FLOAT() != null) {
            rpn.append(ctx.FLOAT().getText()).append(" ");
        } else if (ctx.SCIENTIFIC() != null) {
            rpn.append(ctx.SCIENTIFIC().getText()).append(" ");
        } else if (ctx.FUNC() != null) {
            operatorStack.push(ctx.FUNC().getText());
        } else if (ctx.E() != null) {
            rpn.append(Math.E).append(" ");
        } else if (ctx.PI() != null) {
            rpn.append(Math.PI).append(" ");
        }
    }

    // using a helper method that deals with operators, maintaining correct order based on the order of precedence
    private void handleOperator(String operators) {
        while (!operatorStack.isEmpty() && operators.contains(operatorStack.peek())) {
            rpn.append(operatorStack.pop()).append(" ");
        }
        if (!operatorStack.isEmpty()) {
            operatorStack.push(operators);
        }
    }

    //Evaluates the RPN string and return the calculation result
    public double evaluateRPN() {
        String[] tokens = rpn.toString().trim().split("\\s+");
        Stack<Double> stack = new Stack<>();

        // We then go through each token and in doing so perform calculations/pushing numbers onto the stack
        for (String token : tokens) {
            if (token.matches("[+\\-*/]")) {
                double b = stack.pop();
                double a = stack.pop();
                // Here we perform arithmetic based on the operator
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            } else if (token.matches("^(log|ln|sin|cos|tan|asin|acos|atan|sinh|cosh|tanh|!)$")) {
                double value = stack.pop(); //Apply function to the number on the top of the stack
                // Apply mathematical functions and push onto the stack
                switch (token) {
                    // Here we List of possible functions and their implementations to solve the arithmetic
                    case "log": stack.push(Math.log10(value)); break;
                    case "ln": stack.push(Math.log(value)); break;
                    case "sin": stack.push(Math.sin(value)); break;
                    case "cos": stack.push(Math.cos(value)); break;
                    case "tan": stack.push(Math.tan(value)); break;
                    case "asin": stack.push(Math.asin(value)); break;
                    case "acos": stack.push(Math.acos(value)); break;
                    case "atan": stack.push(Math.atan(value)); break;
                    case "sinh": stack.push(Math.sinh(value)); break;
                    case "cosh": stack.push(Math.cosh(value)); break;
                    case "tanh": stack.push(Math.tanh(value)); break;
                    case "!": stack.push(factorial(value)); break; // we have to do special handling for factorial
                }
            } else {
                stack.push(Double.parseDouble(token)); // If it's a number then we can just push it onto the stack
            }
        }

        return stack.pop(); // The last number left is our result
    }

    //simple method to compute factorials used in our calculations
    private double factorial(double value) {
        if (value == 0 || value == 1) {
            return 1; // Base case for factorial
        } else {
            return value * factorial(value - 1); // Recursive case
        }
    }

    // this provides the generated RPN string when needed
    public String getRPN() {
        return rpn.toString().trim();
    }
}
