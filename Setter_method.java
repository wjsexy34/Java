import java.util.Scanner;
/* ���� ������ ����
 * - ���� ������ ���� ������ Ű���� ���
 * - �� �𸣰ڴٸ�..?
 * 		�ʵ�� ������ private 
 * ���
 * 1. ����������
 * 		- public: ����, private: �����
 * 2. ����
 * 		- private �ʵ带 ȹ��
 * 3. ���� 
 * 		- private �ʵ带 ���� */
public class Setter_method {

	public static void main(String[] args) {
		Account3 myAccount = new Account3(5000);
		User2.deposit(myAccount,7000);
		User2.check(myAccount);
	}	
}
class Account3 {
	/* private ����� �ʵ� */ // �ܺο��� ��� �Ұ�.
	private int balance;
	Account3(int balance){
		this.balance = balance;
	}
	
	/* getter */ // ��ȸ������ �������� ���
	public int getBalance() {
		return this.balance;
	}
	
	/* setter */ // ��ȸ������ �ٲٴ� ���
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}

class User2 {
	
	public static void check(Account3 account) {
		System.out.printf("���� �ܾ�: %d\n", account.getBalance());
	}
	
	public static void deposit(Account3 account2,int amount) {
		int bal = account2.getBalance();
		account2.setBalance(bal+amount);
	}
	
}