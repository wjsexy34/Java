import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class API_ArrayList_Random {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	// 1. �Է°� �ޱ�
	int N = scanner.nextInt();
	// 2. N��ü �ֻ��� ����
	Die d = new Die(N);
	System.out.println(d.roll());
	// 3. 1000�� �ֻ����� ���� ����� ����
	// ArrayList���� primitiveŸ���� ���� �� ����. 
	//  primitiveŸ���� int�� ���۷���Ÿ������ ��ȯ��Ų Integer�� ���� �� ��´�.
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	for(int i = 0; i<1000; i++) {
		int randNum = d.roll();
		numbers.add(randNum);
	}
	// 4. ��հ� ���
	int sum = 0;
	for(int i=0; i<numbers.size(); i++) {
		sum += numbers.get(i);
	}
	double avg = average(numbers);
	// 5. ���
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
	private int maxNumber; // �ֻ��� �ִ밪.
	
	public Die(int maxNumber){
	/* 1. ������ ���� */	
	this.maxNumber = maxNumber;
	}
	
	public int roll() {
	/* 2. �޼ҵ� ����: 1~N���� ��ȯ */	
	Random ran = new Random();
	return 1 + ran.nextInt(maxNumber);
	}

}