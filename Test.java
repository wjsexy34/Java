
/* 1. ArrayList Ŭ������ java.util ��Ű������ import �Ͻÿ�.  */
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		/* 2. String�� ���� �� �ִ� ArrayList ��ü�� ����ÿ�. */
//		ArrayList<String> names = new ArrayList<String>();
//		
//		/* 3. ����Ʈ�� �̸��� �߰��Ͻÿ�. */
//		names.add("Kim");
//		names.add("Lee");
//		names.add("Park");
//		names.add("Choi");
//		names.add("Hong");
//		names.add("No");
//		
//		/* 4. �ݺ����� ���� ��� �̸��� ����Ͻÿ�. */
//		for(int i=0; i<names.size(); i++) {
//			System.out.printf("names.get(%d) -> %s \n",i,names.get(i));
//		}
		/* 1.Books�� ��� ���� ArrayList ��ü�� ����ÿ�. */
		// (����)
//		ArrayList<Books> List = new ArrayList<Books>();
//		List.add(new Books("���ǽ�",4500));
//		List.add(new Books("������",4000));
//		List.add(new Books("�ڹ����α׷���",2400));

//		/* 2.Books ��ü�� �����Ͻÿ� */
//		Books onepice = new Books("���ǽ�",4500);
//		Books naruto = new Books("������",4000);
//		Books java = new Books("�ڹ����α׷���",24000);
//		
//		/* 3.ArrayList ��ü�� Book ��ü���� ��������. */
//		List.add(onepice);
//		List.add(naruto);
//		List.add(java);
//		
//		/* 4.����Ʈ�� ��� ��� å ���� ���  */
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
		// Monster ��ü�� ������ ArrayList ����
//	ArrayList<Monster> list = new ArrayList<Monster>();
//	
//	// Monster ��ü ����
//	Monster sul = new Monster("������",1);
//	Monster ork = new Monster("��ũ",3);
//	Monster goll = new Monster("��",8);
//	
//	// ArrayList�� ��ü ���
//	list.add(sul);
//	list.add(ork);
//	list.add(goll);
//	
//	// ��ü ���
//	System.out.println("=== ���� �� ===");
//	for(Monster m : list) {
//		System.out.println(m);
//	}
//	
//	/* 1. ���� 1�� �䳢 ��ü�� �����ϼ���. */
//	Monster toki = new Monster("�䳢",1);
//	/* 2. ArrayList�� ù ����� �������� �䳢�� �����ϼ���. */
//	list.set(0,toki);
//	
//	// ��ü ���
//	System.out.println("=== ���� �� ===");
//	for(Monster m2 : list) {
//		System.out.println(m2);
//	}
//	}
//}
//class Monster {
//	// �ʵ�
//	private String name;
//	private int level;
//	
//	// ������
//	public Monster(String name, int level) {
//		this.name = name;
//		this.level = level;
//	}
//	
//	// �޼ҵ�
//	public String toString() {
//		return String.format("Monster { name: %s, level: %d }",this.name,this.level);
		// Ramen ��ü�� ��� ���� ArrayList�� �����Ͻÿ�.
//	ArrayList<Ramen> list = new ArrayList<Ramen>();
//	 
//	// Ramen ��ü ����
//	Ramen sin = new Ramen("�Ŷ��",800);
//	Ramen jin = new Ramen("�����",700);
//	Ramen bibim = new Ramen("�����",600);
//	
//	/* 1. Ramen ��ü�� ArrayList�� �����ÿ�. */
//	list.add(sin);
//	list.add(jin);
//	list.add(bibim);
//	
//	/* 2. ArrayList�� ��� ��� ��ü ������ ����Ͻÿ�. */
//	for(Ramen r : list) {
//		System.out.println(r);
//	}
//	System.out.println("================================");
//	
//	/* 3. ������ ����Ͻÿ�. */
//	int sum = 0;
//	for(int i=0; i<list.size(); i++) {
//		sum += list.get(i).getter();
//	}
//	System.out.printf("�հ� : %d��",sum);
//	
//	}
//}
//class Ramen {
//	// �ʵ�
//	private String name;
//	private int price;
//	
//	// ������
//	public Ramen(String name, int price){
//		this.name = name;
//		this.price = price;
//	}
//	
//	// �޼ҵ�
//	public int getter() {
//		return this.price;
//	}
//	
//	// �޼ҵ�
//	public String toString() {
//		return String.format("Ramen { name: %s, price: %d }", this.name,this.price);
//	ArrayList al = new ArrayList();
//	/*  ArrayList�� �޼ҵ��� add();�� ��� ������Ÿ�Ե� ������ �� �ִ� �����̴�.
//	 *  �װ��� �����ϱ� ���ؼ��� add�� ���ڿ� ������Ÿ���� ������Ʈ�����Ѵ�.
//	 *   �ֳ��ϸ� ������Ʈ�� ��� ������Ÿ���� �����̱� ����.*/
//	al.add("one"); // ArrayList�ȿ��� ������Ʈ Ÿ������ ����Ǿ��ִ�.
//	al.add("two");
//	al.add("three");
//	for(int i = 0 ; i < al.size(); i++) {
//		// ������Ʈ Ÿ���� get(i)�� ���� ��ȯ�� ���� StringŸ���� value�� �������� �ؼ� ���� �߻�
////		String value = al.get(i);
//		// ������Ʈ Ÿ���� get(i)�� ���� ��ȯ�� ���� String������ Ÿ������ ����ȯ �������.
//		String value = (String)al.get(i);
//		System.out.println(value);
//	}
//	/* ������ ���� ���� ����� ���� ����̰� Ÿ���� �������� �������� ������ ������� �ʰ� ���� ������ ���� ����� �����.*/
//	Car c = new Car("�ڵ���", 2000);
//	Truck t = new Truck("Ʈ��", 3000, 1.5);
//	Sport s = new Sport("������ī", 6200, 340);
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
//		System.out.println("���");
//	}
//	
//}
//
//class Truck extends Car {
//	private double ton;
//	
//	public Truck(String name, int dpm, double ton){
//		super(name,dpm); // �θ��� �����ڸ� ȣ��! -> �θ��� ��ü ����!
//		this.ton = ton;
//	}
//	
//	public void klaxqn() {
//		System.out.println("����");
//	}
//	
//	public void load() {
//		System.out.println("���� �ƴ´�.");
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
//		 System.out.println("�ؾƾӖؾ�");
//	 }
//	 
//	 public void drive () {
//		 System.out.println("����̺�!");
//
//	����Ʈ ������ ȣ�� �� 
//	new B();
//	}
//}
//class A{
//	int i = 7;
//	
//	// ����Ʈ ������!: �ڵ����� ȣ��!
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
		/* [�߻� Ŭ����] */
//		// �� ���� ��ü ����
//		Circle c = new Circle("��",3);
//		EquilateralTriangle e = new EquilateralTriangle("���ﰢ��",6);
//		Rectangle r = new Rectangle("���簢��",9,10);
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
//	 return String.format("[%s]�� ����: %.2f",this.name,0);
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
//		return String.format("[%s]�� ����: %.2f",name,area);
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
//		return String.format("[%s]�� ����: %.2f",name,area);
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
//		return String.format("[%s]�� ����: %.2f",name,area);
		/* ============================================================= */
//					[ ��Ӱ� �������̽� ���� 1]
//		// ��ü ����
//		KRW krw = new KRW(1500.00,"��");
//		USD usd = new USD(100.50,"�޷�");
//		EUR eur = new EUR(260.87,"����");
//		JPY jpy = new JPY(6400.00,"��");
//		// �θ� Ŭ������ ���� �׷�ȭ
//		Currency[] cur = {krw,usd,eur,jpy};
//		// ��� ȭ�������� ���
//		for(Currency c : cur) {
//			System.out.printf("%s\n",c.toString());
//		}
//	}
//}
//// 1. �θ�Ŭ���� �ۼ�
//class Currency {
//	// 1.1 �ߺ� �ʵ带 �ۼ�
//	private double amount; // ����
//	private String notation; // ǥ���
//	// 1.2 �����ڸ� �ۼ�
//	public Currency(double amount,String notation) {
//		this.amount = amount;
//		this.notation = notation;
//	}
//	// 3. toString() �޼ҵ� �������̵�
//	// ���۸�: "�ڹ� Object toString() �޼ҵ�"
//	public String toString() {           // �� Ư�� ��ü�� Ŭ�������� ������. ��        
//		return String.format("%s: %.2f %s",this.getClass().getSimpleName(),amount,notation);
//	}
//}
//
//// 2. �ڽ�Ŭ������ �θ�Ŭ���� ���
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
//					[ ��Ӱ� �������̽� ���� 2]
		// ��ǰ ��ü ����
		// 1-1 Goods�� �ش��ϴ� ��� ��ü��
//		Goods m = new Monitor("FHD ���̵� �����",450000);
//		Goods t = new TV("5K ������ TV",2350000);
//		Goods c = new Computer("��Ʈ�� �����",1650000);
//		
//		// ��ٱ��Ͽ� ���
//		// 1-2 ArrayList�� ��� �� �ִ�.
//		ArrayList<Goods> cart = new ArrayList<Goods>();
//		cart.add(m);
//		cart.add(t);
//		cart.add(c);
//		// ��ٱ��� ���� ���
//		for(Goods g : cart) {
//			System.out.println(g.toString());
//		}
//	}
//}
///* �θ����� �߻�Ŭ���� */
//abstract class Goods {
//	/* (1) �߻� Ŭ������ �ʵ带 �߰��Ͻÿ� */
//	private String name; // �̸� 
//	private int price;   // ����
//	/* (2) �߻� Ŭ������ �����ڸ� �߰��Ͻÿ� */
//	public Goods(String name, int price){
//		this.name = name;
//		this.price = price;
//	}
//	/* (3) �߻� Ŭ������ toString() �޼ҵ带 �������̵��Ͻÿ�.*/
//	public String toString() {
//		return String.format("%s: %d��",name,price);
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
//					[ ��Ӱ� �������̽� ���� 3]	
		// �� ���� ����
//		Knight useo = new HolyKnight("�켭", 200, 10); // ����縦 ���� �ٶ󺸱⋚���� ����� ���Ҹ� ��� ����.
//		Knight arthas = new MagicKnight("�Ƽ���", 150, 8);
//
//		/*������ �޸��Ѵ�!!!*/
//		/*���̾�׷��� �����ϴ� ������ ������!*/
//		
//		// �켭: ��� ����
//		useo.increaseHp();
//		useo.increaseArmor();
//		// �켭: ����� ����
//		HolyKnight holyuseo = (HolyKnight) useo; // ĳ���� (������ �ٸ��� �ٶ�)
//		holyuseo.healingAura();
//		holyuseo.holyArmor();
//		
//		// �Ƽ���: ��� ����
//		arthas.increaseHp();
//		arthas.increaseArmor();
//		// �Ƽ���: ���˻� ����
//		MagicKnight magicarthas = (MagicKnight) arthas;
//		magicarthas.fireArmor();
//		magicarthas.thunderBlade();
//
//  }
//}
//
//interface Tanker {
//	public void increaseArmor(); // �Ƹ�
//
//	public void increaseHp(); // ü�� +100
//}
//
//interface Healer {
//	public void healingAura(); // �ʴ� ü��ȸ�� +10
//
//	public void holyArmor(); // ������ ���� -10
//}
//
//interface Sorcerer {
//	public void fireArmor(); // �ֺ��� �ʴ� ������ +10
//
//	public void thunderBlade(); // ���ݽ� �߰� ������ +10
//}
//
//class Knight implements Tanker {
//	protected String name;
//	protected int armor;
//	protected int hp;
//
//	public Knight(String name, int armor, int hp) {
//		this.name = name;
//		this.armor = armor;
//		this.hp = hp;
//	}
//
//	public void increaseArmor() {
//		System.out.printf("[%s] increaseHp() ����!\n",name);
//		System.out.printf("\t�ƸӰ� +5 �����մϴ�.\n");
//		armor += 5;
//	}
//
//	public void increaseHp() {
//		System.out.printf("[%s] increaseHp() ����!\n",name);
//		System.out.printf("\tü���� +100 �����մϴ�.\n");
//		hp += 100;
//  }
//}
//
//// 1. �������̽��� �޼ҵ带 �������̵�
//class HolyKnight extends Knight implements Healer {
//	public HolyKnight(String name, int armor, int hp) {
//		super(name, armor, hp);
//	}
//
//	public void healingAura() {
//		System.out.printf("[%s] healingAura() ����!\n",name);
//		System.out.printf("\t�ʴ� ü��ȸ���� +10 �����մϴ�.\n");
//	}
//
//	public void holyArmor() {
//		System.out.printf("[%s] holyArmor() ����!\n",name);
//		System.out.printf("\t�ǰݽ� �������� -10 �� �޽��ϴ�.\n");
//  }
//}
//
//
//class MagicKnight extends Knight implements Sorcerer {
//	public MagicKnight(String name, int armor, int hp) {
//		super(name, armor, hp);
//	}
//
//	public void fireArmor() {
//		System.out.printf("[%s] fireArmor() ����!\n",name);
//		System.out.printf("\t�ʴ� �ֺ� ������ �ʴ� +10�� �������� �ݴϴ�.\n");
//	}
//
//	public void thunderBlade() {
//		System.out.printf("[%s] healingAura() ����!\n",name);
//		System.out.printf("\t�� ���ݽ� +10�� �߰� �������� �ݴϴ�.\n");

	Scanner sca = new Scanner(System.in);
	System.out.println("시작 단과 끝단을 입력하세요.");
	System.out.print("시작 단 : "); 
	int in1 = sca.nextInt();
	System.out.print("끝 단 : ");
	int in2 = sca.nextInt();
	System.out.println();
	for(int i=1; i<=9; i++) {
		for(int a=in1;a<=in2;a++) {
		System.out.printf("%dx%d=%d\t",a,i,a*i);
		}
		System.out.println();
	}
		
//	System.out.printf("������ �� �ⷫ�� ����? :");
//	int in = sca.nextInt();
//	System.out.printf("����ڰ� �Է��� �� : %d\n\n",in);
//	if(in < 2 || in > 9) {
//		System.out.println("���� �߸� �Է��߽��ϴ�.");
//	}else {
//		for(int i=1; i<10; i++) {
//			System.out.printf("%dx%d=%d\n",in,i,in*i);
//		}
//	}
	
//	int[] result = new int[9];
//	for(int i=1; i<=result.length; i++) {
//		result[i-1] = 2*i;
//	}
//	for(int i=1; i<=result.length; i++) {
//		System.out.println(result[i-1]);
//	}
	sca.close();
	}
}