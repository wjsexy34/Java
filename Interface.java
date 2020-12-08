
public class Interface {
	public static void main(String[] args) {
//		// 객체 생성
//		Person personPark = new Person("홍팍");
//		
//		// 객체를 학생의 관점으로 바라봄
//		// Person 클래스가 Student 인터페이스 구현체이므로 가능.
//		Student2 studentPark = personPark;
//		// 학생의 본분
//		studentPark.study();
//		studentPark.drinBeer();
//		
//	}
//}
//
//// 학생 역할을 인터페이스로 정의
//interface Student2 {
//	public void study();	// 공부하기 프로토타입 메소드
//	public void drinBeer(); // 술마시기 프로토타입 메소드
//}
//
//// 학생의 역할을 부여받은 Person 클래스
//class Person implements Student2 {
//	private String name;
//	
//	public Person(String name){
//		this.name = name;
//	}
//	
//	@Override // 메소드 재정의
//	public void study() {
//		System.out.printf("%s이는 공부중!\n",this.name);
//	}
//	@Override
//	public void drinBeer() {
//		System.out.printf("%s이는 음주중!\n",this.name);
//===================================================================		
//	/*			                  [다형성]							*/
//	// Person 객체 생성
//	Person2 hongpark = new Person2("홍팍");
//	// 개발자로서 변신
//	Develope devepark = hongpark;
//	devepark.programing("Java");
//	// 강사로 변신
//	Teacher teachpark = hongpark;
//	teachpark.lecture("자료구조");
//	// 마사지사로 변신
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
//	/* 인터페이스 프로토타입 메소드들을 오버라이드하시오. */
//	public void programing(String lang) {
//		System.out.println(this.name + " ->" + " " + lang + " 프로그래밍중!");
//	}
//	public void lecture(String subject) {
//		System.out.println(this.name + " ->" + " " +subject + " 수업중!");
//	}
//	public void masage() {
//		System.out.println(this.name + " -> 마사지중!");
//	}
//   ===================================================================
/* 					          [그룹화]							      */     		
	// 객체 생성
	Kim kim = new Kim("뮤지션 김씨");
	Lee lee = new Lee("건축가 이씨");
	Park park = new Park("개발자 박씨");
	Choi choi = new Choi("변호사 최씨");
	 
	 // 그룹화: 인터페이스 기준
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
		System.out.println(this.name+" -> 칭구 아이가!");
	}
}

class Lee implements Friend {
	private String name;
	
	public Lee(String name){
		this.name = name;
	}
	
	public void friend() {
		System.out.println(this.name + " -> 칭구 아이가!");
	}
}

class Park implements Friend {
	private String name;
	
	public Park(String name) {
		this.name = name;
	}
	
	public void friend () {
		System.out.println(this.name + " -> 칭구 아이가!");
	}
}

class Choi implements Friend{
	private String name;
	
	public Choi(String name) {
		this.name = name;
	}
	
	public void friend() {
		System.out.println(this.name + " -> 칭구 아이가!");
	}
}