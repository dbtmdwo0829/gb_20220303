package MyFinance;

class Account {
	private String id;
	private String password;
	private String name;
	private String company;
	private String hold;
	private int deposit;
	private int income;
	private int balance;
	
	// 생성자
	public Account(String id, String password, String name, String company, String hold, 
			int deposit, int income, int balance) {
		this.id = id; // 내 아이디
		this.password = password; // 비밀번호
		this.name = name; // 계정을 사용하고 있는 유저의 이름
		this.company = company; // 투자한 회사명
		this.hold = hold; // 보유한 주식수
		this.deposit = deposit; // 입금총액
		this.income = income;  // 수익
		this.balance = balance; // 잔고
	} 	
	
	public String getID() {
		return id;
	}
	public String getPassword() {   
		return password;
	}
	
	public void setPassword(String password) {   
		this.password = password;
	}
	
	public int getBalance() {  
		return balance;
	}
	
	public String getCompany() {    
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getHold() {    
		return hold;
	}
	
	public void setHold(String hold) {
		this.hold = hold;
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
	
	public String getMyAccountInfo() {    // 내 계정 조회
		return "아이디 : " + id + " 비밀번호: " + password + " 이름 : " + name + 
				" 투자회사명" + company + " 보유주수: " + hold + " 입금액 " + deposit + 
				" 수익 " + income + " 잔고" + balance;		
	}

}
