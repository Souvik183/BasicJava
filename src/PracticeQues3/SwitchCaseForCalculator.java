package PracticeQues3;

import java.util.Scanner;

public class SwitchCaseForCalculator {

	public static void main(String[] args) {
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter two numbers : ");
		
		double number1=reader.nextDouble();
		double number2=reader.nextDouble();
		
		System.out.println("Please enter the operator: '+' OR '-' OR '*' OR '/'");
		
		char operator=reader.next().charAt(0);
		double result=0;
				
		switch(operator)
		{
		case '+' : result=  number1+ number2;
		break;
		case '-' : result=  number1- number2;
		break;
		case '*' : result=  number1* number2;
		break;
		case '/' : result=  number1/ number2;
		break;
		}
		System.out.println(result);

	}

}
