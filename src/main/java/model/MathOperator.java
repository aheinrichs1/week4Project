package model;

public class MathOperator {
	
	private Float num1;
	private String op;
	private Float num2;

	public MathOperator() {
		super();
	}
	
	public MathOperator(String num1, String op, String num2) {
		this.num1 = Float.parseFloat(num1);
		this.op = op;
		this.num2 = Float.parseFloat(num2);
	}

	public Float getNum1() {
		return num1;
	}

	public void setNum1(Float num1) {
		this.num1 = num1;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public Float getNum2() {
		return num2;
	}

	public void setNum2(Float num2) {
		this.num2 = num2;
	}
	
	public Float doOperation() {
		if (op.equals("add")) {
				return num1 + num2;
		}
		else if(op.equals("minus")) {
			return num1 - num2;
		}
		else if(op.equals("multiply")) {
			return num1 * num2;
		}
		else {
			return num1 / num2;
		}
	}
	
	public String returnOperatorSymbol() {
		if (op.equals("add")) {
			return "+";
		}
		else if(op.equals("minus")) {
			return "-";
		}
		else if(op.equals("multiply")) {
			return "*";
		}
		else {
			return "/";
		}
	}

}
