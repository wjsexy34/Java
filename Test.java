
/* 1. ArrayList 클래스를 java.util 패키지에서 import 하시오.  */
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
//		/* 2. String을 담을 수 있는 ArrayList 객체를 만드시오. */
//		ArrayList<String> names = new ArrayList<String>();
//		
//		/* 3. 리스트에 이름을 추가하시오. */
//		names.add("Kim");
//		names.add("Lee");
//		names.add("Park");
//		names.add("Choi");
//		names.add("Hong");
//		names.add("No");
//		
//		/* 4. 반복문을 통해 모든 이름을 출력하시오. */
//		for(int i=0; i<names.size(); i++) {
//			System.out.printf("names.get(%d) -> %s \n",i,names.get(i));
//		}
		/* 1.Books을 담기 위한 ArrayList 객체를 만드시오. */
		// (재사용)
//		ArrayList<Books> List = new ArrayList<Books>();
//		List.add(new Books("원피스",4500));
//		List.add(new Books("나루토",4000));
//		List.add(new Books("자바프로그래밍",2400));

//		/* 2.Books 객체를 생성하시오 */
//		Books onepice = new Books("원피스",4500);
//		Books naruto = new Books("나루토",4000);
//		Books java = new Books("자바프로그래밍",24000);
//		
//		/* 3.ArrayList 객체에 Book 객체들을 담으세요. */
//		List.add(onepice);
//		List.add(naruto);
//		List.add(java);
//		
//		/* 4.리스트에 담긴 모든 책 정보 출력  */
//		for(int i=0; i<List.size(); i++) {
//			System.out.printf("List.get(%d) -> %s\n",i,List.get(i));
//		}
//		
//	}
//}
//class Books {
//	private String name;
//	private int price;
//	
//	public Books(String name, int price) {
//		this.name = name;
//		this.price = price;
//	}
//	
//	public String toString() {
//		return String.format("Books { name: %s, price %d }",this.name,this.price);
		// Monster 객체를 저장할 ArrayList 생성
//	ArrayList<Monster> list = new ArrayList<Monster>();
//	
//	// Monster 객체 생성
//	Monster sul = new Monster("슬라임",1);
//	Monster ork = new Monster("오크",3);
//	Monster goll = new Monster("골렘",8);
//	
//	// ArrayList에 객체 담기
//	list.add(sul);
//	list.add(ork);
//	list.add(goll);
//	
//	// 전체 출력
//	System.out.println("=== 변경 전 ===");
//	for(Monster m : list) {
//		System.out.println(m);
//	}
//	
//	/* 1. 레벨 1의 토끼 객체를 생성하세요. */
//	Monster toki = new Monster("토끼",1);
//	/* 2. ArrayList의 첫 요소인 슬라임을 토끼로 변경하세요. */
//	list.set(0,toki);
//	
//	// 전체 출력
//	System.out.println("=== 변경 후 ===");
//	for(Monster m2 : list) {
//		System.out.println(m2);
//	}
//	}
//}
//class Monster {
//	// 필드
//	private String name;
//	private int level;
//	
//	// 생성자
//	public Monster(String name, int level) {
//		this.name = name;
//		this.level = level;
//	}
//	
//	// 메소드
//	public String toString() {
//		return String.format("Monster { name: %s, level: %d }",this.name,this.level);
		// Ramen 객체를 담기 위한 ArrayList를 생성하시오.
//	ArrayList<Ramen> list = new ArrayList<Ramen>();
//	 
//	// Ramen 객체 생성
//	Ramen sin = new Ramen("신라면",800);
//	Ramen jin = new Ramen("진라면",700);
//	Ramen bibim = new Ramen("비빔면",600);
//	
//	/* 1. Ramen 객체를 ArrayList에 담으시오. */
//	list.add(sin);
//	list.add(jin);
//	list.add(bibim);
//	
//	/* 2. ArrayList에 담긴 모든 객체 정보를 출력하시오. */
//	for(Ramen r : list) {
//		System.out.println(r);
//	}
//	System.out.println("================================");
//	
//	/* 3. 총합을 출력하시오. */
//	int sum = 0;
//	for(int i=0; i<list.size(); i++) {
//		sum += list.get(i).getter();
//	}
//	System.out.printf("합계 : %d원",sum);
//	
//	}
//}
//class Ramen {
//	// 필드
//	private String name;
//	private int price;
//	
//	// 생성자
//	public Ramen(String name, int price){
//		this.name = name;
//		this.price = price;
//	}
//	
//	// 메소드
//	public int getter() {
//		return this.price;
//	}
//	
//	// 메소드
//	public String toString() {
//		return String.format("Ramen { name: %s, price: %d }", this.name,this.price);
//	ArrayList al = new ArrayList();
//	/*  ArrayList에 메소드의 add();는 어떠한 데이터타입도 수용할 수 있는 형태이다.
//	 *  그것이 가능하기 위해서는 add의 인자에 데이터타입이 오브젝트여야한다.
//	 *   왜냐하면 오브젝트는 모든 데이터타입의 조상이기 떄문.*/
//	al.add("one"); // ArrayList안에서 오브젝트 타입으로 저장되어있다.
//	al.add("two");
//	al.add("three");
//	for(int i = 0 ; i < al.size(); i++) {
//		// 오브젝트 타입인 get(i)를 통해 반환된 값을 String타입인 value에 넣으려고 해서 오류 발생
////		String value = al.get(i);
//		// 오브젝트 타입인 get(i)를 통해 반환된 값을 String데이터 타입으로 형변환 해줘야함.
//		String value = (String)al.get(i);
//		System.out.println(value);
//	}
//	/* 하지만 위와 같은 방식은 옛날 방식이고 타입의 안정성이 떨어지기 떄문에 사용하지 않고 이전 내용들과 같은 방식을 사용함.*/
//	Car c = new Car("자동차", 2000);
//	Truck t = new Truck("트럭", 3000, 1.5);
//	Sport s = new Sport("스포츠카", 6200, 340);
//	
//	c.klaxqn();
//	t.klaxqn();
//	s.klaxqn();
//	
//	}
//}
//
//class Car {
//	private String name;
//	private  int dpm;
//	
//	public Car(String name, int dpm){
//		this.name = name;
//		this.dpm = dpm;
//	}
//	
//	public void klaxqn() {
//		System.out.println("띠띠");
//	}
//	
//}
//
//class Truck extends Car {
//	private double ton;
//	
//	public Truck(String name, int dpm, double ton){
//		super(name,dpm); // 부모의 생성자를 호출! -> 부모의 객체 생성!
//		this.ton = ton;
//	}
//	
//	public void klaxqn() {
//		System.out.println("빵빵");
//	}
//	
//	public void load() {
//		System.out.println("짐을 싣는다.");
//	}
//}
//
//class Sport extends Car {
//	 private int max;
//	 
//	 public Sport(String name, int dpm,int max){
//		 super(name,dpm);
//		 this.max = max;
//	 }
//	 
//	 public void klaxqn() {
//		 System.out.println("뽜아앙뽜앙");
//	 }
//	 
//	 public void drive () {
//		 System.out.println("드라이브!");
//
//	디폴트 생성자 호출 예 
//	new B();
//	}
//}
//class A{
//	int i = 7;
//	
//	// 디폴트 생성자!: 자동으로 호출!
//	public A() {
//		setI(20);
//		System.out.println("i from A is " + i);
//	}
//	
//	public void setI (int i) {
//		this.i = 2 * i;
//	}
//}
//
//class B extends A{
//	public B( ){
//		//super();
//		// System.out.println("i from B is " + i);	
//	}
//	
//	public void setI(int i) {
//		this.i =3 * i; // 3 * 20
//===================================================================================
		/* [추상 클래스] */
//		// 각 도형 객체 생성
//		Circle c = new Circle("원",3);
//		EquilateralTriangle e = new EquilateralTriangle("정삼각형",6);
//		Rectangle r = new Rectangle("직사각형",9,10);
//		
//		Shape[] shapes = {c,e,r};
//		for(Shape s : shapes) {
//			System.out.println(s.area());
//		}
//	
//	}
//}
//abstract class Shape {
//protected String name;
//
//	Shape(String name){
//		this.name = name;
//	}
// public String area () {
//	 return String.format("[%s]의 넓이: %.2f",this.name,0);
// }
//}
//class Circle extends Shape {
//	protected int radius;
//	Circle(String name,int radius){
//		super(name);
//		this.radius = radius;
//	}
//	public String area() {
//		double area = Math.PI*this.radius*this.radius;
//		return String.format("[%s]의 넓이: %.2f",name,area);
//	}
//}
//class EquilateralTriangle extends Shape{
//	protected int length;
//	public EquilateralTriangle(String name,int length) {
//		super(name);
//		this.length = length;
//	}
//	public String area() {
//		double area = 0.5*this.length*Math.sqrt(3)*this.length;
//		return String.format("[%s]의 넓이: %.2f",name,area);
//	}
//}
//class Rectangle extends Shape{
//	protected int width;
//	protected int height;
//	public Rectangle(String name,int width,int height) {
//		super(name);
//		this.width = width;
//		this.height = height;
//	}
//	public String area() {
//		double area = this.width*this.height;
//		return String.format("[%s]의 넓이: %.2f",name,area);
		/* ============================================================= */
//					[ 상속과 인터페이스 문제 1]
//		// 객체 생성
//		KRW krw = new KRW(1500.00,"원");
//		USD usd = new USD(100.50,"달러");
//		EUR eur = new EUR(260.87,"유로");
//		JPY jpy = new JPY(6400.00,"엔");
//		// 부모 클래스를 통한 그룹화
//		Currency[] cur = {krw,usd,eur,jpy};
//		// 모든 화폐정보를 출력
//		for(Currency c : cur) {
//			System.out.printf("%s\n",c.toString());
//		}
//	}
//}
//// 1. 부모클래스 작성
//class Currency {
//	// 1.1 중복 필드를 작성
//	private double amount; // 수량
//	private String notation; // 표기법
//	// 1.2 생성자를 작성
//	public Currency(double amount,String notation) {
//		this.amount = amount;
//		this.notation = notation;
//	}
//	// 3. toString() 메소드 오버라이딩
//	// 구글링: "자바 Object toString() 메소드"
//	public String toString() {           // ↓ 특정 객체의 클래스명을 가져옴. ↓        
//		return String.format("%s: %.2f %s",this.getClass().getSimpleName(),amount,notation);
//	}
//}
//
//// 2. 자식클래스가 부모클래스 상속
//class KRW extends Currency{
//	public KRW(double amount, String notation) {
//		super(amount,notation);
//	}
//} 
//
//class USD extends Currency{
//	public USD(double amount, String notation) {
//		super(amount,notation);
//	}                                                                                                        
//}
//
//class EUR extends Currency{
//	public EUR(double amount, String notation) {
//		super(amount,notation);
//	}                                                    
//}
//
//class JPY extends Currency{
//	public JPY(double amount, String notation) {
//		super(amount,notation);
		/* ============================================================= */
//					[ 상속과 인터페이스 문제 2]
		// 상품 객체 생성
		// 1-1 Goods에 해당하는 모든 객체는
//		Goods m = new Monitor("FHD 와이드 모니터",450000);
//		Goods t = new TV("5K 벽걸이 TV",2350000);
//		Goods c = new Computer("노트북 고급형",1650000);
//		
//		// 장바구니에 담기
//		// 1-2 ArrayList에 담길 수 있다.
//		ArrayList<Goods> cart = new ArrayList<Goods>();
//		cart.add(m);
//		cart.add(t);
//		cart.add(c);
//		// 장바구니 내역 출력
//		for(Goods g : cart) {
//			System.out.println(g.toString());
//		}
//	}
//}
///* 부모이자 추상클래스 */
//abstract class Goods {
//	/* (1) 추상 클래스의 필드를 추가하시오 */
//	private String name; // 이름 
//	private int price;   // 가격
//	/* (2) 추상 클래스의 생성자를 추가하시오 */
//	public Goods(String name, int price){
//		this.name = name;
//		this.price = price;
//	}
//	/* (3) 추상 클래스의 toString() 메소드를 오버라이딩하시오.*/
//	public String toString() {
//		return String.format("%s: %d원",name,price);
//	}
//}
//
//class Monitor extends Goods {
//	Monitor(String name, int price){
//		super(name,price);
//	}
//}
//
//class TV extends Goods {
//	TV(String name, int price){
//		super(name,price);
//	}
//}
//
//class Computer extends Goods {
//	Computer(String name, int price){
//		super(name,price);
		/* ============================================================= */
//					[ 상속과 인터페이스 문제 3]	
		// 두 영웅 생성
		Knight useo = new HolyKnight("우서", 200, 10); // 성기사를 기사로 바라보기떄문에 기사의 역할만 사용 가능.
		Knight arthas = new MagicKnight("아서스", 150, 8);

		/*관점을 달리한다!!!*/
		/*다이어그램을 참조하는 습관을 들이자!*/
		
		// 우서: 기사 버프
		useo.increaseHp();
		useo.increaseArmor();
		// 우서: 성기사 버프
		HolyKnight holyuseo = (HolyKnight) useo; // 캐스팅 (관점을 다르게 바라봄)
		holyuseo.healingAura();
		holyuseo.holyArmor();
		
		// 아서스: 기사 버프
		arthas.increaseHp();
		arthas.increaseArmor();
		// 아서스: 마검사 버프
		MagicKnight magicarthas = (MagicKnight) arthas;
		magicarthas.fireArmor();
		magicarthas.thunderBlade();

  }
}

interface Tanker {
	public void increaseArmor(); // 아머

	public void increaseHp(); // 체력 +100
}

interface Healer {
	public void healingAura(); // 초당 체력회복 +10

	public void holyArmor(); // 데미지 감소 -10
}

interface Sorcerer {
	public void fireArmor(); // 주변적 초당 데미지 +10

	public void thunderBlade(); // 공격시 추가 데미지 +10
}

class Knight implements Tanker {
	protected String name;
	protected int armor;
	protected int hp;

	public Knight(String name, int armor, int hp) {
		this.name = name;
		this.armor = armor;
		this.hp = hp;
	}

	public void increaseArmor() {
		System.out.printf("[%s] increaseHp() 시전!\n",name);
		System.out.printf("\t아머가 +5 증가합니다.\n");
		armor += 5;
	}

	public void increaseHp() {
		System.out.printf("[%s] increaseHp() 시전!\n",name);
		System.out.printf("\t체력이 +100 증가합니다.\n");
		hp += 100;
  }
}

// 1. 인터페이스의 메소드를 오버라이딩
class HolyKnight extends Knight implements Healer {
	public HolyKnight(String name, int armor, int hp) {
		super(name, armor, hp);
	}

	public void healingAura() {
		System.out.printf("[%s] healingAura() 시전!\n",name);
		System.out.printf("\t초당 체력회복이 +10 증가합니다.\n");
	}

	public void holyArmor() {
		System.out.printf("[%s] holyArmor() 시전!\n",name);
		System.out.printf("\t피격시 데미지를 -10 덜 받습니다.\n");
  }
}


class MagicKnight extends Knight implements Sorcerer {
	public MagicKnight(String name, int armor, int hp) {
		super(name, armor, hp);
	}

	public void fireArmor() {
		System.out.printf("[%s] fireArmor() 시전!\n",name);
		System.out.printf("\t초당 주변 적에게 초당 +10의 데미지를 줍니다.\n");
	}

	public void thunderBlade() {
		System.out.printf("[%s] healingAura() 시전!\n",name);
		System.out.printf("\t매 공격시 +10의 추가 데미지를 줍니다.\n");
  }
}

