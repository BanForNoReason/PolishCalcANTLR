package gen;// Generated from C:/Users/jonah_pc/IdeaProjects/ReversePolishCalculator.java/src/ReversePolishCalculator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReversePolishCalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReversePolishCalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReversePolishCalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ReversePolishCalculatorParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReversePolishCalculatorParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ReversePolishCalculatorParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReversePolishCalculatorParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(ReversePolishCalculatorParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReversePolishCalculatorParser#base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase(ReversePolishCalculatorParser.BaseContext ctx);
}