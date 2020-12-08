import java.util.Arrays;
import java.util.Scanner;

public class Static_method {
	public static void main(String[] args) {
		Test2.m1(); // static 메소드는 객체 생성 없이 호출 가능. (좋은 호출방법)
		Test2 t = new Test2();
		t.m2();		// static이 붙지 않은 메소드는 객체 생성 후 사용. t -> 레퍼런스 변수
		t.m1(); 	// 유틸리티 메소드는 객체를 가지고도 호출 가능. 일반적으로 좋은코드는 아님
					// (좋지 않은 호출방법)
  }
}
class Test2 {
	Test2(){}
	// 유틸리티 메소드z
	static void m1() {
	 System.out.println("유틸리티 메소드 호출!");
 }
	// 일반메소드
	void m2() {
	 System.out.println("일반 메소드 호출!");
 }

}