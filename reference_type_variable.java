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
		Money money2 = new Money(10000); // money2 -> {won: 10000} #2000(�ּҰ�)
		System.out.print(money2.getWon() + " -> ");	// 10000 ->
		zero(money2); 				// �Ķ���� Ÿ���� Money�� zero�޼ҵ� ȣ��
		System.out.println(money2.getWon());
	}
	public static void zero(int d) { // int d = money1; �纻 o
		d = 0; // d = 0;
	}
    //  Money m = money2; �纻, Ÿ���� Money�� ���� ����.
	// money2 - #2000(�ּҰ�) �纻
	public static void zero(Money m) {
		m.won = 0;		// m.�� ���� money2��ü�� won�� 0���� �ٲ�
	}
}
class Money{
	int won;
	Money(int w){ // ������
		won = w;
	}
	public int getWon() {
		return won;
	}
}