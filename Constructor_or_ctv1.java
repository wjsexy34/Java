import java.util.Arrays;
import java.util.Scanner;

public class Constructor_or_ctv1 {
	public static void main(String[] args) {
		// a -> {name: "�Ƽ���", hp: 30}
		Hero a = new Hero("�Ƽ���", 30); // ��ü ���� (�����ڸ� ���Ͽ� �ʱ�ȭ)
		// b -> {name: "��ƺ��", hp: 30}
		Hero b = new Hero("��ƺ��", 30); // ��ü ���� (�����ڸ� ���Ͽ� �ʱ�ȭ)

		Hero c = new Hero();
		Hero e = new Hero();
		Vill v = new Vill("���", 30);

		c.name = "�Ƹ�";
		c.hp = 30;
		e.name = "Ƽ��";
		e.hp = 30;
		c.punch(a, v);
		// �޼ҵ� ȣ��
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
	// �ʵ�
	String name;
	int hp;
	// ������
	Hero() {}
	Hero(String _name, int _hp) {
		name = _name;
		hp = _hp;
 }
	// �޼ҵ�
	// Ÿ�����μ��� Ŭ����: Ŭ������ ����ڰ� ������ �Ǵٸ� Ÿ���̴�.
	void punch(Hero enenmy, Vill enenmy2) { // Hero enemy = b;
	 enenmy.hp -= 10;
	 enenmy2.hp -= 10;
	 System.out.printf("[%s]�� ��ġ!\n", name);
	 System.out.printf("\t%s HP: %d\n", enenmy.name, enenmy.hp);
	 System.out.printf("\t%s HP: %d\n", enenmy2.name, enenmy2.hp);
 }
}