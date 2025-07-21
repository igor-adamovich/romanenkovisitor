package exmaple;

public class Visitor {
	public int add(Add expr) {
		return Expression.eval(this, expr.a) + Expression.eval(this, expr.b);
	}
	
	public int cst(Cst expr) {
		return expr.c;
	}
}
