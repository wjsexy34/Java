
public class Interface {
	public static void main(String[] args) {
//		// ��ü ����
//		Person personPark = new Person("ȫ��");
//		
//		// ��ü�� �л��� �������� �ٶ�
//		// Person Ŭ������ Student �������̽� ����ü�̹Ƿ� ����.
//		Student2 studentPark = personPark;
//		// �л��� ����
//		studentPark.study();
//		studentPark.drinBeer();
//		
//	}
//}
//
//// �л� ������ �������̽��� ����
//interface Student2 {
//	public void study();	// �����ϱ� ������Ÿ�� �޼ҵ�
//	public void drinBeer(); // �����ñ� ������Ÿ�� �޼ҵ�
//}
//
//// �л��� ������ �ο����� Person Ŭ����
//class Person implements Student2 {
//	private String name;
//	
//	public Person(String name){
//		this.name = name;
//	}
//	
//	@Override // �޼ҵ� ������
//	public void study() {
//		System.out.printf("%s�̴� ������!\n",this.name);
//	}
//	@Override
//	public void drinBeer() {
//		System.out.printf("%s�̴� ������!\n",this.name);
//===================================================================		
//	/*			                  [������]							*/
//	// Person ��ü ����
//	Person2 hongpark = new Person2("ȫ��");
//	// �����ڷμ� ����
//	Develope devepark = hongpark;
//	devepark.programing("Java");
//	// ����� ����
//	Teacher teachpark = hongpark;
//	teachpark.lecture("�ڷᱸ��");
//	// ��������� ����
//	Masagesa masagepark = hongpark;
//	masagepark.masage();
//	}
//}
//interface Develope {
//	public void programing(String lang);
//}
//interface Teacher {
//	public void lecture(String subject);
//}
//interface Masagesa {
//	public void masage ();
//}
//
//class Person2 implements Develope,Teacher,Masagesa{
//private String name;	
//	
//	Person2(String name){
//		this.name = name;
//	}
//	/* �������̽� ������Ÿ�� �޼ҵ���� �������̵��Ͻÿ�. */
//	public void programing(String lang) {
//		System.out.println(this.name + " ->" + " " + lang + " ���α׷�����!");
//	}
//	public void lecture(String subject) {
//		System.out.println(this.name + " ->" + " " +subject + " ������!");
//	}
//	public void masage() {
//		System.out.println(this.name + " -> ��������!");
//	}
//   ===================================================================
/* 					          [�׷�ȭ]							      */     		
	// ��ü ����
	Kim kim = new Kim("������ �达");
	Lee lee = new Lee("���డ �̾�");
	Park park = new Park("������ �ھ�");
	Choi choi = new Choi("��ȣ�� �־�");
	 
	 // �׷�ȭ: �������̽� ����
	 Friend[] friend = {kim,lee,park,choi};
	 for(Friend f : friend) {
		 f.friend();
	 }
	}
}
interface Friend {
	 public void friend();
}

class Kim implements Friend {
	private String name;
	
	public Kim(String name){
		this.name = name;
	}
	
	public void friend() {
		System.out.println(this.name+" -> Ī�� ���̰�!");
	}
}

class Lee implements Friend {
	private String name;
	
	public Lee(String name){
		this.name = name;
	}
	
	public void friend() {
		System.out.println(this.name + " -> Ī�� ���̰�!");
	}
}

class Park implements Friend {
	private String name;
	
	public Park(String name) {
		this.name = name;
	}
	
	public void friend () {
		System.out.println(this.name + " -> Ī�� ���̰�!");
	}
}

class Choi implements Friend{
	private String name;
	
	public Choi(String name) {
		this.name = name;
	}
	
	public void friend() {
		System.out.println(this.name + " -> Ī�� ���̰�!");
	}
}