package exmaple;

import ru.psiras.spec.tools.annotations.Specialize;

public class Expression {
	public static final int CST = 0;
	public static final int ADD = 1;
	
	public int type;
	
	@Specialize
	public static int eval(Visitor visitor, Expression expr) {
		switch (expr.type) {
			case CST: return visitor.cst((Cst) expr);
			default: return visitor.add((Add)expr);
		}
	}
	
	@Specialize
	public static int expr_val(Expression expr) {
		return eval(new Visitor(), expr);
	}
}
