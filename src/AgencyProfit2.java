

import java.util.Scanner;
public class AgencyProfit2 {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		String name = inp.nextLine();
		int countAdult = inp.nextInt();
		int countChild = inp.nextInt();
		double fulPrice = inp.nextDouble();
		double price = inp.nextDouble();
		inp.close();
		
		double childPrice;
		childPrice = 30.0 / 100 * fulPrice;
		
		double ful;
		ful= (fulPrice + price) * countAdult + (childPrice + price) * countChild;
		
		double profit =ful*20.0/100;
		String s="";
	    s ="The profit of your agency from " + name + " tickets is " + String.format("%.2f",profit) + " lv." ;
	    System.out.println(s);

		
	}

}
