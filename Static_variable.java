
public class Static_variable {

	public static void main(String[] args) {
		Student a = new Student("tom");
		System.out.println(a.count);
		
		Student b = new Student("John");
		System.out.println(b.count);
		
		Student c = new Student("Kate");
		System.out.println(c.count);
	}
}
class Student {
	// Ŭ���� ����: ��ü �ܺ��� ���찡���� ����!
	static int count = 0;
	
	// �ν��Ͻ� ����: ��ü ������ ����!
	String name;
	
	Student(String name) {
		count ++;
		this.name = name;
	}
}
