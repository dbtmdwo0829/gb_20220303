package Management;

class Stock {
	private String account;
	private String password;
	private String name;
	private String company;
	private int deposit;
	private int income;
	private int balance;
	
	
	public Stock(String account, String password, String name, String company, int deposit, int income, int balance) {
		this.account = account; // 내 계정
		this.password = password; // 계정 비밀번호
		this.name = name; // 계정을 사용하고 있는 유저의 이름
		this.company = company; // 투자한 회사명
		this.deposit = deposit; // 입금액
		this.income = income;  // 수익
		this.balance = balance; // 잔고
	} 	
	public String getMyAccountInfo() {    // 내 계정 조회
		return "계정명 : " + account + ", 이름 : " + name + ", 비밀번호: " + password + ", 회사명" + company + ", 입금액 " + deposit + 
				", 수익 " + income + ", 잔고" + balance;		
	}
	public String getAccount() {
		return account;
	}
	public String getPassword() {     // 비밀번호 조회 기능
		return password;
	}
	
	public void setPassword(String password) {    // 비밀번호 변경 기능
		this.password = password;
	}
	
	public int getBalance() {   // 잔액조회
		return balance;
	}
	
	public String getCompany() {    // 투자회사명
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void deposit(int deposit) {
		if(deposit <= 0 ) {   // 입금
			System.out.println(" 현재 주식계좌에 입금된 금액을 입력해주세요.");
			return;
		}
		balance += deposit;
	}
	
	public void withdraw(int withdraw) {
		if(withdraw > balance ) {
			System.out.println(" 잔액이 부족합니다.");
			return;
		}
		
		if(withdraw <= 0) {
			System.out.println(" 입력하신 금액이 맞는지 다시한번 확인해주세요.");
			return;
		}
		balance -= withdraw;
	}
	
	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}
	
	
}
