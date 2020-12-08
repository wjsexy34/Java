import java.util.Scanner;

public class exex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for(int i=0; i<=a; i++) {
			if(i%3==0)
			System.out.print(i +"±è ");
			else if(i%3==1)
			System.out.print(i +"¿ì ");	
			else
			System.out.print(i +"Áø " );
		}
	}

}
