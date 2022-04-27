package test1;

public class type {

	public static void main(String[] args) {
		// 문제1. 1 부터 20 까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
		}
		System.out.println(" 총합 : " + sum );
		
		
		// 문제2. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		
		int sum2 = 0;
		for (int i = 1; i <=10; i++) {
			for (int j = 1; j <= i; j++) {
				sum2 += j;
			}
		}
		System.out.println(" 결과 : " + sum2 );
		

	}

}
