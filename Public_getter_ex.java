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
public class Public_getter_ex {
	public static void main(String[] args) {
		Account2 myaccount = new Account2(5000);
		User.check(myaccount);
	}
}

class Account2 {
	private int balance;
	Account2(int balance){
		this.balance = balance;
	}
	
	public int getBalance() {
		return this.balance;
	}
}

class User {
	public static void check(Account2 account) {
		System.out.printf("���� �ܾ�: %d��\n",account.getBalance());
	}
}


