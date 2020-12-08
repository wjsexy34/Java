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
public class private_ex {

	public static void main(String[] args) {
		Account myAccount = new Account(1000000);
		
		System.out.println(myAccount); // 1,000,000
		Hacker.malcious(myAccount);
		System.out.println(myAccount); // 0
	}
}

// Account class
class Account {
	/* private */ int balance; // 잔액 (private로 Account클래스 내부에서만 사용 가능.
	public Account(int balance) {
		this.balance = balance ; 
	}
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
}

// Hacker class
class Hacker {
	// 계좌 잔액을 0원으로 변경
	public static void malcious(Account account) {
		account.balance = 0;
	}
}