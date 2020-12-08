/* �߻� Ŭ������?
 * ����
 * - ��ü ���� �Ұ� Ŭ����(Ÿ��)
 * => �ڽ� Ŭ������ ���� ���������� ��ü ����
 * ����
 * - abstract Ű���带 ����Ͽ� �߻� Ŭ������ ����
 *   ex) public abstract class Something { => �Ϲ� Ŭ������ ����
 *   	// ���� ���� ����..					   => abstract Ű���� �߰�
 *   	}
 *   ���� ��� ����ҳ�?
 *   - ��� ��ü�� ������ ������ �� ���� ���(�Ǵ� �����ϸ� �ȵǴ� ���)
 * 
 * �߻�Ŭ������ ����
 * �� ����ؾ� �ϴ°�? : ��Ӱ� �������̽��� ������ ��� ������ �ֱ� �����̴�.
 * ����� ����
 * - �ڵ� �ߺ� ���� => ����� ���� �ʵ� & �޼ҵ� �ߺ� ����
 * �������̽��� ����
 * - �������� �׷�ȭ => [������]: �� ��ü�� �پ��� �ؼ�
 *               => [�׷�ȭ]: �پ��� ��ü�� �ϳ��� Ÿ������ ����
 * 	[���]
 * 1. �߻�Ŭ������
 * 	- ��ü ���� �Ұ� Ŭ����(Ÿ��) => �ڽ� Ŭ������ ���� ���������� ��ü ����
 * 2. ����, ��� ����ұ�?
 * 	- ��� ��ü�� ������ ������ �� ���� ���(�Ǵ� �����ϸ� �ȵǴ� ���)
 * 	- abstract Ű���带 ����Ͽ� ����
 * 3. �߻� Ŭ������ ����
 * 	- �ڵ� �ߺ� ���� => ����� ���ؼ�
 * 	- �������� �׷�ȭ => �������̽� ����~*/
public class Abstract_class {
	public static void main(String[] args) {
		// ���� �ٸ� ��ü ����
		Juice j = new Juice();
		Coffe c = new Coffe();
		Beer b = new Beer();
		Water w = new Water();
		Tea t = new Tea();
		// �߻�Ŭ������ ���� �׷�ȭ
		Drink[] drinks = {j, c, b, w, t};
		// �׷�ȭ�� ��ü���� �ֹ� ��� ���
		for (Drink d : drinks) {
			d.ordered();
		}
	}
}

// (1) �߻� Ŭ���� Drink�� ����
abstract class Drink  {
	String name;
	double price;
	public void ordered() {
		System.out.println("�ֹ��Ǿ����ϴ�.");
  }
}

// (2) ����� ���� �ߺ��ڵ带 �ٿ���.
class Juice extends Drink {}

class Coffe extends Drink {}

class Beer extends Drink {}

class Water extends Drink {}

class Tea extends Drink {}