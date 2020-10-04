package Main;

public class Calculate extends ABS_Calculate {
	
	ABS_AddSub addSub;
	ABS_MulDiv mulDiv;
	
	
	

	public ABS_AddSub getAddSub() {
		return addSub;
	}


	public void setAddSub(ABS_AddSub addSub) {
		this.addSub = addSub;
	}


	public ABS_MulDiv getMulDiv() {
		return mulDiv;
	}


	public void setMulDiv(ABS_MulDiv mulDiv) {
		this.mulDiv = mulDiv;
	}


	@Override
	public int getResult(int a, int b, String op) {
		// TODO Auto-generated method stub
		if (op.equals("+"))
			return add(a,b);
		else if(op.equals("-"))
			return sub(a,b);
		else if(op.equals("*"))
			return mul(a,b);
		else if(op.equals("/"))
			return div(a,b);
		
		return Integer.MIN_VALUE;
	}
	
	
	private int add(int a, int b) {
		return addSub.add(a, b);
	}
	
	private int sub(int a, int b) {
		return addSub.sub(a, b);
	}
	
	private int mul(int a, int b) {
		return mulDiv.mul(a, b);
	}
	
	
	private int div(int a, int b) {
		return mulDiv.div(a, b);
	}

}
