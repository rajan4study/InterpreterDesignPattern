package com.study.pattern;

public class OrExp implements Expression {

	private Expression ex1 = null;
	private Expression ex2 = null;

	public OrExp(Expression ex1, Expression ex2) {
		this.ex1 = ex1;
		this.ex2 = ex2;
	}

	@Override
	public boolean interpret(String context) {

		return ex1.interpret(context) || ex2.interpret(context);
	}

}
