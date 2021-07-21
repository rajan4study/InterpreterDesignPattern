package com.study.pattern;

public class TerminalExpression implements Expression {
	
	private String data;

	public TerminalExpression(String context) {
		this.data = context;
	}

	@Override
	public boolean interpret(String context) {
		if(context.contains(data)) {
			return true;
		}
		return false;
	}

}
