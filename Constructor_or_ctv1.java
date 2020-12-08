import java.util.Arrays;
import java.util.Scanner;

public class Constructor_or_ctv1 {
	public static void main(String[] args) {
		// a -> {name: "아서스", hp: 30}
		Hero a = new Hero("아서스", 30); // 객체 생성 (생성자를 통하여 초기화)
		// b -> {name: "디아블로", hp: 30}
		Hero b = new Hero("디아블로", 30); // 객체 생성 (생성자를 통하여 초기화)

		Hero c = new Hero();
		Hero e = new Hero();
		Vill v = new Vill("쿠바", 30);

		c.name = "아리";
		c.hp = 30;
		e.name = "티모";
		e.hp = 30;
		c.punch(a, v);
		// 메소드 호출
//		a.punch(b);
//		b.punch(a);
//		b.punch(a);
//		a.punch(b);
//		a.punch(b);
 }
}
class Vill {

	String name;
	int hp;

	Vill(String _name, int _hp) {
	 name = _name;
	 hp = _hp;
 }
}
class Hero {
	// 필드
	String name;
	int hp;
	// 생성자
	Hero() {}
	Hero(String _name, int _hp) {
		name = _name;
		hp = _hp;
 }
	// 메소드
	// 타입으로서의 클래스: 클래스는 사용자가 정의한 또다른 타입이다.
	void punch(Hero enenmy, Vill enenmy2) { // Hero enemy = b;
	 enenmy.hp -= 10;
	 enenmy2.hp -= 10;
	 System.out.printf("[%s]의 펀치!\n", name);
	 System.out.printf("\t%s HP: %d\n", enenmy.name, enenmy.hp);
	 System.out.printf("\t%s HP: %d\n", enenmy2.name, enenmy2.hp);
 }
}