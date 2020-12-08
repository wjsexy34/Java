/* this Ű����
 * ����
 * - �ڽ��� ����Ű�� ���۷��� ���� 
 * ex_ (A�� B���� "��ġ�� ���� �� ����? -> B: "�ƴ�, ��(this) ���� ���� Ȳ����
 * 	   �� �־���") 
 * ��� 
 *  1. thisŰ����
 *     - �ڽ��� ����Ű�� ���۷��� ����
 *  2. ��������?
 *     - ������ Ȱ�� ����
 *     - �ʵ� -> Ŭ������ ����
 *     - �������� & �Ķ���� -> �޼ҵ� ����  
 *     (�������� �浹 ���� ��쿡 thisŰ���带 ����ؼ� �ذ��Ѵ�.) */
public class This_keyword {
	public static void main(String[] args) {
		Account4 a = new Account4(10000);
		Account4 b = new Account4(3000);
		a.send(4000,b); // a���°� 4õ���� b���¿��� �۱�!
	}
}
class Account4 {
	// �ʵ� -> Ŭ���� ���� ����
	private int balance;
	
	// ������
	// ������(scope): ������ Ȱ�� ����!
	// ���� Ž�� ����: ���� ����� ��(������)���� �˻�!
	// this.�� ���� ���, �ʵ庸�ٴ� ����� �Ķ���͸� ���.
	// this.�� ������� ������ ���� �ʵ� ���� ������ �ʴ´�.
	public Account4(int balance){ // �Ķ����(������) -> �ش� �޼ҵ� ����
		this.balance = balance;
		System.out.println("���»���:\n\t" + this.toString());
	}
	 
	public void send(int amount, Account4 target) {
		System.out.println("�۱ݽ���:\n\t" + this.toString());
		this.balance -=  amount;
		target.balance += amount;
		System.out.println("�۱ݿϷ�:\n\t" + this.toString());
	}
	
	// toString: ���� ��ü�� ������ ���ڿ��� ���
		public String toString() {
			return String.format("Acount [balance-%d]", this.balance);
		}
	
}
