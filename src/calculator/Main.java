//Jonah Chegarnov
package calculator;

import org.antlr.v4.runtime.*;
import gen.ReversePolishCalculatorLexer;
import gen.ReversePolishCalculatorParser;

public class Main {
    public static void main(String[] args) throws Exception {
        // our sample expression that we are using
        String expression = "1+2!÷(3-4**2)";

        //creating a CharStream from the expression
        CharStream input = CharStreams.fromString(expression);

        //creating a lexer and token stream
        ReversePolishCalculatorLexer lexer = new ReversePolishCalculatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create the parser
        ReversePolishCalculatorParser parser = new ReversePolishCalculatorParser(tokens);

        // creating a ReversePolishCalculator listener
        ReversePolishCalculator calculator = new ReversePolishCalculator();

        // adding the listener to the parser.
        parser.addParseListener(calculator);

        //start parsing the expression
        parser.expression();

        // Print the generated Reverse Polish Notation(RPN) and the result
        System.out.println("Expression: " + expression);
        System.out.println("RPN: " + calculator.getRPN());
        System.out.println("Result: " + calculator.evaluateRPN());
    }
}