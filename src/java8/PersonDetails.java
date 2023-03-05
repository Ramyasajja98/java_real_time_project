package java8;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class PersonDetails {

	public static void main(String[] args) {
		//input declarations
		double amt = 1234.56789;
		//DecimalFormat df = new DecimalFormat("#,###");
		String firstName = "Saidivya";
		String lastName =  "Gogineni";
		int birthDay = 1;
		String birthMonth = "November";
		int birthYear = 1995;
		//print statements to display details
		System.out.println("The Amount is: $" + NumberFormat.getInstance().format(amt) );
		System.out.println("My name is " + firstName + " " + lastName + " and I was born on " + 
		birthMonth + " " + birthDay + ", " + birthYear);
		System.out.println(firstName + "       " + lastName + "       -       " + birthYear);
	}

}

