package MyFinance;

import java.util.Scanner;

public class Management {
	private static Account[] accounts = new Account[20];
	private static int el = 0;

	public static int checkID(String id) {    // 계정 확인
		for( int i = 0; i < el; i++) {
			if(accounts[i].getID().contentEquals(id)) {
				return i;
			}
		}
		return -1;
	}
	
	public static void createAccount() {    // 계정 생성
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String id = scan.nextLine();
		System.out.print("비밀번호: ");
		String password = scan.nextLine();
		System.out.print("이름: ");
		String name = scan.nextLine();
		System.out.print("투자회사명: ");
		String company = scan.nextLine();
		System.out.print("보유주수: ");
		String hold = scan.nextLine();
		System.out.print("입금액: ");
		int deposit = scan.nextInt();
		System.out.print("수익: ");
		int income = scan.nextInt();
		System.out.print("잔고: ");
		int balance = scan.nextInt();
		
		accounts[el] = new Account(id, password, name, company, hold, deposit, income, balance);
		el++;
		
		System.out.println("새로운 ID를 생성하였습니다.");
			
	}

	
	public static void checkDeposit() {   // 입금 기능
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" ID 입력 " );
		String id = scan.nextLine();
		System.out.print(" 희망 입금액: " );
		int won = scan.nextInt();
		
		int el = checkID(id);
		if( el != -1) {
			accounts[el].deposit(won);			
		} else {
			System.out.println(" 존재하지않는 ID 입니다.");
		}		
	}
	
	public static void checkWithdraw() {   //출금 기능
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" ID 입력 ");
		String id = scan.nextLine();
		System.out.print(" 비밀번호 입력 ");
		String password = scan.nextLine();
		System.out.print(" 희망 출금액 : ");
		int won = scan.nextInt();
		
		int el = checkID(id);
		if(el == -1) {
			System.out.println(" 존재하지 않는 ID 입니다.");
		} else {
			if(!accounts[el].getPassword().equals(password)) {
				System.out.println(" 올바르지 않은 접근입니다 다시 입력해주세요.");
				return;				
			}
			accounts[el].withdraw(won);
			System.out.printf("%d원을 출금하셨습니다.%n", won);
		}
		
	}
	
	public static void checkBalance() {  // 잔액 조회
		Scanner scan = new Scanner(System.in);
		System.out.print("계정 입력");
		String id = scan.nextLine();
		
		int el = checkID(id);
		if(el != -1) {
			System.out.printf("잔고 %d%n", accounts[el].getBalance());
		} else {
			System.out.println("존재하지 않는 계정입니다.");
		}		
	}
	
	public static void checkMyAccountList() {   // 저장된 계정들 조회
		for(int i = 0; i < el; i++) {
			System.out.printf("%s%n", accounts[i].getMyAccountInfo());
		}
		
	}
	
	public static void main(String[] args) {
		Account[] me = new Account[10];
		Scanner scan = new Scanner(System.in);
		boolean End = false;
		do {
			System.out.println("-------------------------------------------");
			System.out.println("1. ID 생성 | 2. 입금액 | 3. 출금액 | 4. 잔고 조회  ");
			System.out.println("5. 생성된 ID 확인 | 6. 종료 ");
			System.out.println("-----------------번호 입력-------------------");
			int list = scan.nextInt();   
				
			switch(list) {
			case 1 :
				System.out.println(" ID 생성");
				createAccount();
				break;
			case 2 :
				System.out.println(" 입금 ");
				checkDeposit();
				break;
			case 3 :
				System.out.println(" 출금 ");
				checkWithdraw();
				break;
			case 4 : 
				System.out.println(" 잔고 조회 ");
				checkBalance();
				break;
			case 5 : 
				System.out.println(" 생성된 ID 확인");
				checkMyAccountList();
				break;
			case 6 : 
				System.out.println(" 프로그램을 종료합니다. ");
				End = true;
				break;
			default :
				System.out.println(" 올바르지 않은 입력 입니다.");
					
			}
		} while(!End);
			
	}

}
