import java.util.Scanner;

public class AddBags {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
	
		double fulPrice = inp.nextDouble();
		double kg = inp.nextDouble();		
		int days = inp.nextInt();
		int count = inp.nextInt();	
		
		double newPrice;
		if( kg >20) newPrice = fulPrice;
		else if( kg >=10) newPrice = 50.0/100*fulPrice;
		else  newPrice = 20.0/100*fulPrice;
		
		if( days >30) newPrice = newPrice*110.0/100;
		else if( days >=7) newPrice = 115.0/100*newPrice;
		else  newPrice = 140.0/100*newPrice;
		
		newPrice =newPrice*count;
		System.out.println(" The total price of bags is: "+ String.format("%.2f", newPrice)+" lv." );
	}

}
