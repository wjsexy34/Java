import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class API_ArrayList_Random {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	// 1. 입력값 받기
	int N = scanner.nextInt();
	// 2. N면체 주사위 생성
	Die d = new Die(N);
	System.out.println(d.roll());
	// 3. 1000번 주사위를 던져 결과를 저장
	// ArrayList에는 primitive타입은 담을 수 없다. 
	//  primitive타입인 int를 레퍼런스타입으로 변환시킨 Integer로 변경 후 담는다.
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	for(int i = 0; i<1000; i++) {
		int randNum = d.roll();
		numbers.add(randNum);
	}
	// 4. 평균값 계산
	int sum = 0;
	for(int i=0; i<numbers.size(); i++) {
		sum += numbers.get(i);
	}
	double avg = average(numbers);
	// 5. 출력
	System.out.println("avg: " + avg);
	}
	
	static double average(ArrayList<Integer> list) {
		double sum = 0;
		for(Integer n : list) {
			sum += n;
		}
		return sum/list.size();
	}
}
class Die {
	private int maxNumber; // 주사위 최대값.
	
	public Die(int maxNumber){
	/* 1. 생성자 구현 */	
	this.maxNumber = maxNumber;
	}
	
	public int roll() {
	/* 2. 메소드 구현: 1~N까지 반환 */	
	Random ran = new Random();
	return 1 + ran.nextInt(maxNumber);
	}

}