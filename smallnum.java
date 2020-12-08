import java.util.Scanner;

public class smallnum {
	
	public static int dice() {	
		return (int)(Math.random()*6)+1;
	}
		
	public static void main(String[] args) {

		double earnings = dice() + dice() + dice() + dice() + dice();
		System.out.println("»πµÊ: $ " + earnings);
		
		double profit = earnings-18.0;
		System.out.println("º’¿Õ: $ " + profit);
	}
}