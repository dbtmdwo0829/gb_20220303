package Class;

import java.util.Scanner;

public class Student {
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public static void main(String[] args) {
		int kor, eng, math;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("KOR : ");
		kor = sc.nextInt();
		System.out.println("ENG : ");
		eng = sc.nextInt();
		System.out.println("MATH : ");
		math = sc.nextInt();
		int total = kor+eng+math;
		double avg = total/3.0;
		
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println("-------------------------------------------");
		
		Student art = new Student("유승재", 1, 23, 70, 30, 90);
		
		System.out.println( art.getName() );
		System.out.println( art.getBan() );
		System.out.println( art.getNo() );
		System.out.println( art.getKor() );
		System.out.println( art.getEng() );
		System.out.println( art.getMath() );
				
		
	}


}

