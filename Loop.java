import java.util.*;

public class Loop {

	public static void main(String[] args) {
		// for문 : 조건을 만족하는 동안 블럭{}을 반복 - 반복횟수를 알 때 적합.
	
//		for(int i = 1; i <=10; i++) { // 괄호{}안의 문장을 3번 반복
//			System.out.println("Hello");
//		}
//		for(int i = 1, j = 10; i <= 10; i++, j--) { // 타입이 같으며 변수 추가가능. 연산자도 동일.
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
		
//		1. i = 5줄
//		2. j = 10칸
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
		
//		1. j값이 i값과 똑같이 변해야함.
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
//		같지 않다 : !=
//		while문 : 조건을 만족시키는 동안 블럭{}을 반복 - 반복횟수 모를 때
		
//		int i = 5; // 반복할 횟수를 넣는다.
//		
//		while(--i!=0) {
//			System.out.println(i);
//			System.out.println(i + " - I can do it.");
//		}
		
//		int sum = 0;
//		int i = 0;
//		// i를 1씩 증가시켜서 sum에 계속 더해나간다.
//		while (sum <= 100) {
//			System.out.printf("%d - %d%n",i,sum);
//			sum += ++i;
//		}
		
//		int num = 0, sum = 0;
//		System.out.print("숫자를 입력하세요.(예:12345)>");
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 
//		num = Integer.parseInt(tmp);
//		
//		while(num!=0) {
//			sum += num%10;
//			System.out.printf("sum=%3d num=%d%n", sum,num);
//			
//			num /= 10;
//		}
//		
//		System.out.println("각 자리수의 합:"+sum);
		
//		int num = 12345, sum = 0;
		// 10으로 나머지 연산을 하면 마지막 자리를 얻는다.
//		System.out.println(12345%10);
		
//		while(num>0) { 
//			sum += num%10;
//			System.out.println("sum="+sum+",num%10="+num%10 );
//			num = num / 10;
//		}
//		System.out.println("각 자리수의 합"+sum);
		
//		do-while문 : 블럭{}을 최소한 한 번 이상 반복 - 사용자 입력 받을 때 유용.
//		do {
//			// 조건식의 연산결과가 참일 때 수행될 문장들을 적는다.(처음 한번은 무조건 실행)
//		}while (조건식); <- //끝에 ';'을 잊지 않도록 주의
		
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*101) +1;
		System.out.println("answer="+answer);
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요");
			}else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		}while(input!=answer);
		System.out.println("정답입니다!");
		
	} // main의 끝
}