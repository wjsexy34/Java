//  Ŭ������ ����
//  Ŭ������ �ʵ�� �޼ҵ�� �����Ѵ�.
//  �ʵ�� ����
//  �޼ҵ�� ����
//  ����/����� ���θ� ����
//  
//  ���� �����ڶ�?
//  ����
//  - ���� ���θ� �����ϴ� Ű����
//  - ������ �����Ģ(ĸ��ȭ, ��������)�� ����
//  
//  [����] : �̸�, ���, �λ��ϱ�()
//  [�����] : ü��, ����, �����ϱ�()
//	���� �������� ����
//  - private : �����
//    1. �ܺ� ���� ����
//    2. �ش� Ŭ������ ���ο����� ��� ����
//  - default : ��Ű�� ����
//  - protected : (��Ű�� ��)��� ����
//  - public : ���� ����
//	  1. �ܺ� ���� ���
public class private_ex {

	public static void main(String[] args) {
		Account myAccount = new Account(1000000);
		
		System.out.println(myAccount); // 1,000,000
		Hacker.malcious(myAccount);
		System.out.println(myAccount); // 0
	}
}

// Account class
class Account {
	/* private */ int balance; // �ܾ� (private�� AccountŬ���� ���ο����� ��� ����.
	public Account(int balance) {
		this.balance = balance ; 
	}
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
}

// Hacker class
class Hacker {
	// ���� �ܾ��� 0������ ����
	public static void malcious(Account account) {
		account.balance = 0;
	}
}