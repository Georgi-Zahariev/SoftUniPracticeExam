import java.util.Scanner;

class Agency {
	String name;
	int countAdult, countChild;
	double price, fulPrice;

	public Agency(Scanner inp) {
		name = inp.nextLine();
		countAdult = inp.nextInt();
		countChild = inp.nextInt();
		fulPrice = inp.nextDouble();
		price = inp.nextDouble();
		inp.close();
	}

	public double childPrice(double a) {
		return 30.0 / 100 * a;
	}

	public double fulSum() {
		return (fulPrice + price) * countAdult + (childPrice(fulPrice) + price) * countChild;
	}

	public double profit(double a) {
		return a * 20.0 / 100;
	}

	@Override
	public String toString() {
		return "The profit of your agency from " + name + " tickets is " + String.format("%.2f", profit(fulSum())) + " lv.";
	}

}

public class AgencyProfit {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		Agency a = new Agency(inp);
		System.out.println(a.toString());

	}

}
