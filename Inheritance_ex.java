/*1. ����̶�
 *   - �ڽ� Ŭ������ �θ��� �Ӽ��� �����޴� ��. ( Cat extends Animal )
 *   - super(); �θ� Ŭ������ ������ ȣ��
 *2. �޼ҵ� �������̵�
 *	 - �θ� �޼ҵ带 �ڽ� Ŭ�������� ������ �ϴ� ��.
 *3. protected
 *	 - ��� ���� ������ ���� ���
 *	�ڽ� ��ü ������ ������
 *	 ���� ��
 *		- �ڽ� ��ü ������, �θ� Ŭ������ ������ ���� ������ �Ѵ�.*/
public class Inheritance_ex {

	public static void main(String[] args) {
		// ��ü ����
		Novice chobo = new Novice("�ʺ�", 100);
		Wizard wizard = new Wizard("�ظ�����",100,100);
		
		System.out.println(chobo.toString());
		System.out.println(wizard.toString());
	}
}

class Novice {
	// �ʵ�
	protected String name; // protected: ��Ӱ���� ����(�ڽĵ��� ����)
	protected int hp;
	// ������
	public Novice(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	// toString
	public String toString() {
		return String.format("[Novice] %s(HP: %d)",this.name,this.hp);
	}
}

class Wizard extends Novice {
	private int mp;
	
	public Wizard(String name, int hp, int mp) {
	/* �θ�Ŭ������ �����ڸ� ȣ�� (�ǹ��� ���� �� 1���� �������� 2���� ���� �� �ִ�.
	 * ���������� �ڽ�Ŭ������ ����������� ���� �θ�Ŭ������ ������ �ʱ�ȭ �ž��� ����� �������� �ڽ� ��ü�� �������. */
		super(name,hp); 
		this.mp = mp;
	}
	
	public String toString() {
		return String.format("[Wizard] %s(HP: %d, MP: %d)",this.name,this.hp,this.mp);
	}
}