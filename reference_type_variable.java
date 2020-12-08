import java.util.Arrays;
import java.util.Scanner;

public class reference_type_variable{
	public static void main(String[] args) {
		// primitive
		int money1 = 10000; // money: 10000
		System.out.print(money1 + " -> "); // 10000 -> 
		zero(money1);
		System.out.println(money1); // 10000
		
		// reference
		Money money2 = new Money(10000); // money2 -> {won: 10000} #2000(주소값)
		System.out.print(money2.getWon() + " -> ");	// 10000 ->
		zero(money2); 				// 파라미터 타입이 Money인 zero메소드 호출
		System.out.println(money2.getWon());
	}
	public static void zero(int d) { // int d = money1; 사본 o
		d = 0; // d = 0;
	}
    //  Money m = money2; 사본, 타입이 Money인 값을 받음.
	// money2 - #2000(주소값) 사본
	public static void zero(Money m) {
		m.won = 0;		// m.을 통해 money2객체의 won을 0으로 바꿈
	}
}
class Money{
	int won;
	Money(int w){ // 생성자
		won = w;
	}
	public int getWon() {
		return won;
	}
}