import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		System.out.print("in put dan : ");
		Scanner scanner = new Scanner(System.in);
//		int in = scanner.nextInt();
//		Gugudan.calculate(in);
		String in = scanner.nextLine();
		String[] splite = in.split(",");
		int first = Integer.parseInt(splite[0]);
		int second = Integer.parseInt(splite[1]);
		Gugudan.calculate(first, second);
		scanner.close();
	}
}
