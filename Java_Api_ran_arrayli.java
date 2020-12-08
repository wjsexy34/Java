
/* �ڹ� API��?
 * ����
 *  - ���� ���Ǹ� ���� �����Ǵ� Ŭ���� �� ����
 * ����
 *  - ���� ȿ���� ����  
 * ��� ��
 *  - System.out.println();
 *  - Math.random();  
 *  
 *  [�װ��� ��� ���� �ȴ�?
 *  ! ��Ű�� !�� ���� �ȴ�.]
 *  
 * ��Ű����?
 * ����
 *  - �ҽ��ڵ带 ��� ���� �ٷ��� (����) 
 * ����
 *  - ������ �ҽ��ڵ� �׷�ȭ
 *  - ���� �̸��� �ҽ��ڵ� ����  ex) apple
 *  							- ipad.java
 *  							- iphone.java
 *  							- MacBook.java
 *  						  car
 *  							- Sonata.java
 *  						  music
 *  							- Sonata.java
 * �ڹ� API ���� ���� ��
 *  �ڹ� API ���� �˻�
 *   - https://docs.oracle.com/javase/8/docs/api/ */
// package
import java.util.ArrayList; // �ڷᱸ�� ù ���� ! �߿� !
import java.util.Random;

public class Java_Api_ran_arrayli {
	public static void main(String[] args) {
		// Random ��ü ����
		/*
		 * Random rand = new Random();
		 * 
		 * 
		 * // ���� ���� int a = rand.nextInt(); 1. ������ ������ �����Ͻÿ�. int b = rand.nextInt(30);
		 * 2. 0~30 ������ ������ �����Ͻÿ�. double c = rand.nextDouble(); 3. ������ �Ǽ��� �����Ͻÿ�.
		 * boolean d = rand.nextBoolean(); 4. ������ ��/������ �����Ͻÿ�.
		 * 
		 * // ��� System.out.printf("nextInt(): %d\n" , a);
		 * System.out.printf("nextInt(30): %d\n", b);
		 * System.out.printf("nextDouble(): %f\n", c);
		 * System.out.printf("nextBoolean(): %s\n", d);
		 */
		// ��ü �迭
//		Book[] books = new Book[5];
		ArrayList<Book> books = new ArrayList<Book>(); // ����
//		int count = 0;

		//��ü ����
//		books[count++] = new Book("������", 4000);
		books.add(new Book("������",4000));	// �߰�
//		books[count++] = new Book("���ǽ�", 4500);
		books.add(new Book("���ǽ�", 4500));
//		books[count++] = new Book("������ũ", 5000);
		books.add(new Book("������ũ", 5000));
		
		//��ü ���
		for(Book b : books) {
		   	System.out.println(b.toString());
		}   
		   
		// ���۷��� ������ �״�� ��� ��, �ڵ����� toString()�޼ҵ尡 ȣ��ȴ�.
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
		return String.format("%s(%d��)", this.title, this.price);
	}
}
