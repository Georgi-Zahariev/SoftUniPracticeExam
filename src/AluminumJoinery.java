import java.util.Scanner;

public class AluminumJoinery {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int count = inp.nextInt();
		String kind = inp.next();
		inp.nextLine();
		String delivery = inp.nextLine();
	
		double ful;
		double alone;
		
		if( kind.equals("90X130")) {
		    alone = 110;
		    ful= alone*count;
		    if(count>60) {
		    	ful= 92.0/100*ful;
		    }else if( count >30) {
		    	ful= 95.0/100*ful;
		    }
		}else if( kind.equals("100X150")) {
			alone= 140;
			 ful= alone*count;
			    if(count>80) {
			    	ful= ful*90.0/100;
			    }else if( count >40) {
			    	ful= ful*94.0/100;
			    }
		}else if( kind.equals("130X180")) {
			alone= 190;
			 ful= alone*count;
			    if(count>50) {
			    	ful= ful*88.0/100;
			    }else if( count >20) {
			    	ful= ful*93.0/100;
			    }
		}else {
			alone=250;
			 ful= alone*count;
			    if(count>50) {
			    	ful= ful*86.0/100;
			    }else if( count >25) {
			    	ful= ful*91.0/100;
			    }
		}
		
		
		if( delivery.equals("With delivery")) {ful+=60.0;}
		
		
		if( count<10) {
			System.out.println("Invalid order");
	    }else if( count>99) {
		System.out.println( String.format("%.2f",ful*96.0/100) + " BGN");
		}
		else System.out.println( String.format("%.2f",ful) +" BGN");
	}

}

