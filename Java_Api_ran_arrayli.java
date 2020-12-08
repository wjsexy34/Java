
/* 자바 API란?
 * 개념
 *  - 개발 편의를 위해 제공되는 클래스 및 도구
 * 장점
 *  - 개발 효율성 증가  
 * 사용 예
 *  - System.out.println();
 *  - Math.random();  
 *  
 *  [그것이 어떻게 제공 된다?
 *  ! 패키지 !로 제공 된다.]
 *  
 * 패키지란?
 * 개념
 *  - 소스코드를 담아 놓은 꾸러미 (폴더) 
 * 장점
 *  - 연관된 소스코드 그룹화
 *  - 같은 이름의 소스코드 구분  ex) apple
 *  							- ipad.java
 *  							- iphone.java
 *  							- MacBook.java
 *  						  car
 *  							- Sonata.java
 *  						  music
 *  							- Sonata.java
 * 자바 API 문서 보는 법
 *  자바 API 문서 검색
 *   - https://docs.oracle.com/javase/8/docs/api/ */
// package
import java.util.ArrayList; // 자료구조 첫 관문 ! 중요 !
import java.util.Random;

public class Java_Api_ran_arrayli {
	public static void main(String[] args) {
		// Random 객체 생성
		/*
		 * Random rand = new Random();
		 * 
		 * 
		 * // 난수 생성 int a = rand.nextInt(); 1. 임의의 정수를 생성하시오. int b = rand.nextInt(30);
		 * 2. 0~30 사이의 정수를 생성하시오. double c = rand.nextDouble(); 3. 임의의 실수를 생성하시오.
		 * boolean d = rand.nextBoolean(); 4. 임의의 참/거짓을 생성하시오.
		 * 
		 * // 출력 System.out.printf("nextInt(): %d\n" , a);
		 * System.out.printf("nextInt(30): %d\n", b);
		 * System.out.printf("nextDouble(): %f\n", c);
		 * System.out.printf("nextBoolean(): %s\n", d);
		 */
		// 객체 배열
//		Book[] books = new Book[5];
		ArrayList<Book> books = new ArrayList<Book>(); // 생성
//		int count = 0;

		//객체 생성
//		books[count++] = new Book("나루토", 4000);
		books.add(new Book("나루토",4000));	// 추가
//		books[count++] = new Book("원피스", 4500);
		books.add(new Book("원피스", 4500));
//		books[count++] = new Book("슬램덩크", 5000);
		books.add(new Book("슬램덩크", 5000));
		
		//객체 출력
		for(Book b : books) {
		   	System.out.println(b.toString());
		}   
		   
		// 레퍼런스 변수를 그대로 출력 시, 자동으로 toString()메소드가 호출된다.
		// 
 		System.out.println("\n"+books);
	}
}
class Book {
	 private String title;
	 private int price;
	
	Book (String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public String toString() {
		return String.format("%s(%d원)", this.title, this.price);
	}
}
