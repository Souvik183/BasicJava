package PracticeQues;

import java.util.Scanner;

public class PrintanInteger {

	public static void main(String[] args) {
		
		
		//this are user defined values.
		//For user defined case we have to use Scanner class
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter a number : ");
		
		float floatnumber=reader.nextFloat();
		System.out.println("You enetered float number: "+floatnumber);
		
		int intnumber=reader.nextInt();
		System.out.println("You enetered float number: "+intnumber);

	}

}
