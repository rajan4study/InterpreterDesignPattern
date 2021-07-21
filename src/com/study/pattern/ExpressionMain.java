package com.study.pattern;

public class ExpressionMain {
	public static void main(String[] args) {
		Expression nameExp= getOrExp();
		Expression marriedExp= getAndExp();
		
		System.out.println(nameExp.interpret("Rajan"));
		System.out.println(nameExp.interpret("Gopy"));
		System.out.println(marriedExp.interpret("Rasika Rajan"));
		System.out.println(marriedExp.interpret("Gopy"));
	}

	private static Expression getAndExp() {
		Expression ex1=new TerminalExpression("Rasika");
		Expression ex2=new TerminalExpression("Rajan");
		return new AndExp(ex1, ex2);
	}

	private static Expression getOrExp() {
		Expression ex1=new TerminalExpression("Rajan");
		Expression ex2=new TerminalExpression("Toby");
		return new OrExp(ex1, ex2);
	}

}
