package calc;

class Calc{
	private static String sum;
	private static int oper;
	
	public Calc( String sum, int oper ) {
		Calc.sum = sum;
		Calc.oper = oper;
	}
	
	public String getSum() {
		return sum;
	}

	public void setSum(String sum) {
		Calc.sum = sum;
	}

	public int getOper() {
		return oper;
	}

	public void setOper(int oper) {
		Calc.oper = oper;
	}
	
	int plus( int x, int y ) {
		return x + y;
	}
	
	int minus( int x, int y ) {
		return x - y;
	}
	
	int times( int x, int y ) {
		return x * y;
	}
	
	float times2( float x, float y ) {
		return x * y;
	}
	
	int divide( int x, int y ) {
		int result = 0;
		
		if( y != 0 ) {	
			result =  x / y; 
		}
				
		return result;
	}

	public static void main(String[] args) {
		
		Calc c = new Calc(sum, oper);
		
		int p = c.plus(100, 50);
		System.out.println("100 + 50 = " + p);
		
		System.out.println("100 - 50 = " + c.minus(100, 50));
		
		System.out.println("100 * 50 = " + c.times(100, 50));
		System.out.println("100 * 50 = " + c.times2(1.1f, 2.1f));
		
		System.out.println("100 / 50 = " + c.divide(100, 50));
	}
		
		
}



