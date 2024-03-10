package gen;// Generated from C:/Users/jonah_pc/IdeaProjects/ReversePolishCalculator.java/src/ReversePolishCalculator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReversePolishCalculatorParser}.
 */
public interface ReversePolishCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReversePolishCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ReversePolishCalculatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReversePolishCalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ReversePolishCalculatorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReversePolishCalculatorParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ReversePolishCalculatorParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReversePolishCalculatorParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ReversePolishCalculatorParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReversePolishCalculatorParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ReversePolishCalculatorParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReversePolishCalculatorParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ReversePolishCalculatorParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReversePolishCalculatorParser#base}.
	 * @param ctx the parse tree
	 */
	void enterBase(ReversePolishCalculatorParser.BaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReversePolishCalculatorParser#base}.
	 * @param ctx the parse tree
	 */
	void exitBase(ReversePolishCalculatorParser.BaseContext ctx);
}