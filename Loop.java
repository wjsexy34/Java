import java.util.*;

public class Loop {

	public static void main(String[] args) {
		// for�� : ������ �����ϴ� ���� ��{}�� �ݺ� - �ݺ�Ƚ���� �� �� ����.
	
//		for(int i = 1; i <=10; i++) { // ��ȣ{}���� ������ 3�� �ݺ�
//			System.out.println("Hello");
//		}
//		for(int i = 1, j = 10; i <= 10; i++, j--) { // Ÿ���� ������ ���� �߰�����. �����ڵ� ����.
//			System.out.println("i="+i+",j="+j);
//		}
//		int sum = 0;
//		
//		for(int i = 1; i<=5; i++) {
//			sum += i;	// sum = sum + i;
//			System.out.println(sum);
//		}
		
//		1(i)*1(j)=(i*j)1
//      2(i)*1(j)=(i*j)2
		
//		for(int i = 2; i<=9; i++) {
//			for(int j = 1; j<=9; j++) {
//				System.out.println(i+"*"+j+"="+(i*j));
//			}
//			System.out.println();
//		}
		
//		1. i = 5��
//		2. j = 10ĭ
//		**********
//		**********
//		**********
//		**********
//		**********
		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j<=10; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		1. j���� i���� �Ȱ��� ���ؾ���.
//		*
//		**
//		***
//		****
//		*****
		
//		for(int i = 1; i <= 10; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		���� �ʴ� : !=
//		while�� : ������ ������Ű�� ���� ��{}�� �ݺ� - �ݺ�Ƚ�� �� ��
		
//		int i = 5; // �ݺ��� Ƚ���� �ִ´�.
//		
//		while(--i!=0) {
//			System.out.println(i);
//			System.out.println(i + " - I can do it.");
//		}
		
//		int sum = 0;
//		int i = 0;
//		// i�� 1�� �������Ѽ� sum�� ��� ���س�����.
//		while (sum <= 100) {
//			System.out.printf("%d - %d%n",i,sum);
//			sum += ++i;
//		}
		
//		int num = 0, sum = 0;
//		System.out.print("���ڸ� �Է��ϼ���.(��:12345)>");
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� 
//		num = Integer.parseInt(tmp);
//		
//		while(num!=0) {
//			sum += num%10;
//			System.out.printf("sum=%3d num=%d%n", sum,num);
//			
//			num /= 10;
//		}
//		
//		System.out.println("�� �ڸ����� ��:"+sum);
		
//		int num = 12345, sum = 0;
		// 10���� ������ ������ �ϸ� ������ �ڸ��� ��´�.
//		System.out.println(12345%10);
		
//		while(num>0) { 
//			sum += num%10;
//			System.out.println("sum="+sum+",num%10="+num%10 );
//			num = num / 10;
//		}
//		System.out.println("�� �ڸ����� ��"+sum);
		
//		do-while�� : ��{}�� �ּ��� �� �� �̻� �ݺ� - ����� �Է� ���� �� ����.
//		do {
//			// ���ǽ��� �������� ���� �� ����� ������� ���´�.(ó�� �ѹ��� ������ ����)
//		}while (���ǽ�); <- //���� ';'�� ���� �ʵ��� ����
		
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*101) +1;
		System.out.println("answer="+answer);
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1�� 100������ ������ �Է��ϼ���.>");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����");
			}else if(input < answer) {
				System.out.println("�� ū ���� �ٽ� �õ��غ�����.");
			}
		}while(input!=answer);
		System.out.println("�����Դϴ�!");
		
	} // main�� ��
}