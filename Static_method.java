import java.util.Arrays;
import java.util.Scanner;

public class Static_method {
	public static void main(String[] args) {
		Test2.m1(); // static �޼ҵ�� ��ü ���� ���� ȣ�� ����. (���� ȣ����)
		Test2 t = new Test2();
		t.m2();		// static�� ���� ���� �޼ҵ�� ��ü ���� �� ���. t -> ���۷��� ����
		t.m1(); 	// ��ƿ��Ƽ �޼ҵ�� ��ü�� ������ ȣ�� ����. �Ϲ������� �����ڵ�� �ƴ�
					// (���� ���� ȣ����)
  }
}
class Test2 {
	Test2(){}
	// ��ƿ��Ƽ �޼ҵ�z
	static void m1() {
	 System.out.println("��ƿ��Ƽ �޼ҵ� ȣ��!");
 }
	// �Ϲݸ޼ҵ�
	void m2() {
	 System.out.println("�Ϲ� �޼ҵ� ȣ��!");
 }

}