/* this 키워드
 * 개념
 * - 자신을 가리키는 레퍼런스 변수 
 * ex_ (A가 B에게 "또치야 어제 잘 들어갔어? -> B: "아니, 나(this) 어제 완전 황당한
 * 	   일 있었어") 
 * 요약 
 *  1. this키워드
 *     - 자신을 가리키는 레퍼런스 변수
 *  2. 스코프란?
 *     - 변수의 활동 영역
 *     - 필드 -> 클래스의 내부
 *     - 지역변수 & 파라미터 -> 메소드 내부  
 *     (스코프가 충돌 나는 경우에 this키워드를 사용해서 해결한다.) */
public class This_keyword {
	public static void main(String[] args) {
		Account4 a = new Account4(10000);
		Account4 b = new Account4(3000);
		a.send(4000,b); // a계좌가 4천원을 b계좌에게 송금!
	}
}
class Account4 {
	// 필드 -> 클래스 내부 전역
	private int balance;
	
	// 생성자
	// 스코프(scope): 변수의 활동 영역!
	// 변수 탐색 원리: 가장 가까운 곳(스코프)부터 검색!
	// this.을 뺐을 경우, 필드보다는 가까운 파라미터를 사용.
	// this.를 사용하지 않으면 실제 필드 값은 변하지 않는다.
	public Account4(int balance){ // 파라미터(스코프) -> 해당 메소드 내부
		this.balance = balance;
		System.out.println("계좌생성:\n\t" + this.toString());
	}
	 
	public void send(int amount, Account4 target) {
		System.out.println("송금시작:\n\t" + this.toString());
		this.balance -=  amount;
		target.balance += amount;
		System.out.println("송금완료:\n\t" + this.toString());
	}
	
	// toString: 현재 객체의 정보를 문자열로 출력
		public String toString() {
			return String.format("Acount [balance-%d]", this.balance);
		}
	
}
