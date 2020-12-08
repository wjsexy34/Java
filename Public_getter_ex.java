//  클래스의 구조
//  클래스는 필드와 메소드로 정의한다.
//  필드는 상태
//  메소드는 동작
//  공개/비공개 여부를 결정
//  
//  접근 제한자란?
//  개념
//  - 공개 여부를 결정하는 키워드
//  - 디자인 설계원칙(캡슣화, 정보은닉)과 관련
//  
//  [공개] : 이름, 취미, 인사하기()
//  [비공개] : 체중, 나이, 샤워하기()
//	접근 제한자의 종류
//  - private : 비공개
//    1. 외부 접근 금지
//    2. 해당 클래스의 내부에서만 사용 가능
//  - default : 패키지 공개
//  - protected : (패키지 및)상속 공개
//  - public : 완전 공개
//	  1. 외부 접근 허용
public class Public_getter_ex {
	public static void main(String[] args) {
		Account2 myaccount = new Account2(5000);
		User.check(myaccount);
	}
}

class Account2 {
	private int balance;
	Account2(int balance){
		this.balance = balance;
	}
	
	public int getBalance() {
		return this.balance;
	}
}

class User {
	public static void check(Account2 account) {
		System.out.printf("현재 잔액: %d원\n",account.getBalance());
	}
}


