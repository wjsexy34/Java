/* 추상 클래스란?
 * 정의
 * - 객체 생성 불가 클래스(타입)
 * => 자식 클래스를 통해 간접적으로 객체 생성
 * 형식
 * - abstract 키워드를 사용하여 추상 클래스를 선언
 *   ex) public abstract class Something { => 일반 클래스와 동일
 *   	// 내부 구현 생략..					   => abstract 키워드 추가
 *   	}
 *   언제 어떻게 사용할끼?
 *   - 어떠한 객체가 스스로 존재할 수 없는 경우(또는 존재하면 안되는 경우)
 * 
 * 추상클래스의 장점
 * 왜 사용해야 하는가? : 상속과 인터페이스의 장점을 모두 가지고 있기 때문이다.
 * 상속의 장점
 * - 코드 중복 제거 => 상속을 통한 필드 & 메소드 중복 제거
 * 인터페이스의 장점
 * - 다형성과 그룹화 => [다형성]: 한 객체의 다양한 해석
 *               => [그룹화]: 다양한 객체를 하나의 타입으로 관리
 * 	[요약]
 * 1. 추상클래스란
 * 	- 객체 생성 불가 클래스(타입) => 자식 클래스를 통해 간접적으로 객체 생성
 * 2. 언제, 어떻게 사용할까?
 * 	- 어떠한 객체가 스스로 존재할 수 없는 경우(또는 존재하면 안되는 경우)
 * 	- abstract 키워드를 사용하여 선언
 * 3. 추상 클래스의 장점
 * 	- 코드 중복 제거 => 상속을 통해서
 * 	- 다형성과 그룹화 => 인터페이스 느낌~*/
public class Abstract_class {
	public static void main(String[] args) {
		// 서로 다른 객체 생성
		Juice j = new Juice();
		Coffe c = new Coffe();
		Beer b = new Beer();
		Water w = new Water();
		Tea t = new Tea();
		// 추상클래스를 통한 그룹화
		Drink[] drinks = {j, c, b, w, t};
		// 그룹화된 객체들의 주문 결과 출력
		for (Drink d : drinks) {
			d.ordered();
		}
	}
}

// (1) 추상 클래스 Drink를 선언
abstract class Drink  {
	String name;
	double price;
	public void ordered() {
		System.out.println("주문되었습니다.");
  }
}

// (2) 상속을 통해 중복코드를 줄였음.
class Juice extends Drink {}

class Coffe extends Drink {}

class Beer extends Drink {}

class Water extends Drink {}

class Tea extends Drink {}