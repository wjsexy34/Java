import java.util.Arrays;
import java.util.Scanner;

public class Order_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Manu pizza = new Manu("pizza", 4900);
		Manu apizza = new Manu("applepizza", 5900);
		Manu chzpizza = new Manu("chzpizza", 6900);
		Manu[] manuArrays = { pizza, apizza, chzpizza };

		Order order = new Order();
		order.choice(manuArrays);

		System.out.println("\n\n¢Â Choice Manu: " + Arrays.toString(order.manu) + " ¢Â\n" + "\tTotoal Price: "
				+ order.totalCal(manuArrays) + "$");
	}
}

class Order {
	String[] manu = new String[5];
	int[] price = new int[5];

	void choice(Manu[] m1) {
		Scanner scanner = new Scanner(System.in);
		int choi;
		String ene;
		for (int i = 0; i < manu.length; i++) {
			System.out.println("\n[Choice Manu]");
			for (int c = 0; c < m1.length; c++) {
				System.out.println("Number-" + c + " : " + m1[c].name + "-" + m1[c].price);
			}
			choi = scanner.nextInt();
			if (choi == 0) {
				manu[i] = m1[0].name;
			} else if (choi == 1) {
				manu[i] = m1[1].name;
			} else if (choi == 2) {
				manu[i] = m1[2].name;
			} else {
				System.out.println(
						"\n[There is no menu Please select again.]\n" + "[Enter the number written on the menu.]\n");
				i--;
			}

			boolean result = false;

			while (true) {
				System.out.println("\n- Continue to order? [o]/[x] -");
				ene = scanner.next();
				if (ene.equals("o")) {
					break;
				} else if (ene.equals("x")) {
					for (int j = i + 1; j < manu.length; j++) {
						manu[j] = "-";
					}
					result = true;
					break;
				} else {
					continue;
				}

			}

			if (result) {
				break;
			}

		}
		System.out.println(Arrays.toString(manu));
	}

	int totalCal(Manu[] m2) {
		int sum = 0;
		for (int i = 0; i < manu.length; i++) {
			for (int j = 0; j < m2.length; j++) {
				if (manu[i].equals(m2[j].name)) {
					price[i] = m2[j].price;
				}
			}
			sum += price[i];
		}
		System.out.println(Arrays.toString(price));

		return sum;
	}
}

class Manu {
	String name;
	int price;

	Manu(String name, int price) {
		this.name = name;
		this.price = price;
	}
}