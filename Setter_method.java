import java.util.Scanner;
/* 접근 제한자 사용법
 * - 공개 범위에 따라 적절한 키워드 사용
 * - 잘 모르겠다면..?
 * 		필든느 무조건 private 
 * 요약
 * 1. 접근제한자
 * 		- public: 공개, private: 비공개
 * 2. 게터
 * 		- private 필드를 획득
 * 3. 세터 
 * 		- private 필드를 변경 */
public class Setter_method {

	public static void main(String[] args) {
		Account3 myAccount = new Account3(5000);
		User2.deposit(myAccount,7000);
		User2.check(myAccount);
	}	
}
class Account3 {
	/* private 선언된 필드 */ // 외부에서 사용 불가.
	private int balance;
	Account3(int balance){
		this.balance = balance;
	}
	
	/* getter */ // 우회적으로 가져오는 방법
	public int getBalance() {
		return this.balance;
	}
	
	/* setter */ // 우회적으로 바꾸는 방법
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}

class User2 {
	
	public static void check(Account3 account) {
		System.out.printf("현재 잔액: %d\n", account.getBalance());
	}
	
	public static void deposit(Account3 account2,int amount) {
		int bal = account2.getBalance();
		account2.setBalance(bal+amount);
	}
	
}