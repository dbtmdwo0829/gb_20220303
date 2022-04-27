package type2;

public class type02 {

	public static void main(String[] args) {
		// 다음의 for 문을 while문으로 변경하시오.
		int i = 0;
		int j = 0;
		while (i <= 10) {
			j = 0;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

