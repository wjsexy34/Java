/*1. 상속이란
 *   - 자식 클래스가 부모의 속성을 물려받는 것. ( Cat extends Animal )
 *   - super(); 부모 클래스의 생성자 호출
 *2. 메소드 오버라이딩
 *	 - 부모 메소드를 자식 클래스에서 재정의 하는 것.
 *3. protected
 *	 - 상속 관계 성립시 접근 허용
 *	자식 객체 생성지 주의점
 *	 주의 점
 *		- 자식 객체 생성시, 부모 클래스의 영역을 먼저 만들어야 한다.*/
public class Inheritance_ex {

	public static void main(String[] args) {
		// 객체 생성
		Novice chobo = new Novice("초보", 100);
		Wizard wizard = new Wizard("해리포터",100,100);
		
		System.out.println(chobo.toString());
		System.out.println(wizard.toString());
	}
}

class Novice {
	// 필드
	protected String name; // protected: 상속관계시 공개(자식들은 공개)
	protected int hp;
	// 생성자
	public Novice(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	// toString
	public String toString() {
		return String.format("[Novice] %s(HP: %d)",this.name,this.hp);
	}
}

class Wizard extends Novice {
	private int mp;
	
	public Wizard(String name, int hp, int mp) {
	/* 부모클래스의 생성자를 호출 (건물을 예로 들어서 1층이 지어져야 2층을 지을 수 있다.
	 * 마찬가지로 자식클래스가 만들어지려면 먼저 부모클래스의 영역이 초기화 돼야함 기반이 다저져야 자식 객체가 만들어짐. */
		super(name,hp); 
		this.mp = mp;
	}
	
	public String toString() {
		return String.format("[Wizard] %s(HP: %d, MP: %d)",this.name,this.hp,this.mp);
	}
}