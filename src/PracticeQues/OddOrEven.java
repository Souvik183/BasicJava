package PracticeQues;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*int limit=100;
		for(int i=1; i<=limit; i++)
		{
			if(i%2==0)
			{
				continue;
			}
			if(i>60)
			{
				break;
			}
			System.out.println(i);
		}*/
		
		Scanner read=new Scanner(System.in);
		System.out.println("Please enter a number : ");
		
		int intnumber=read.nextInt();
		if(intnumber%2==0)
		{
			System.out.println("Even no is" + intnumber);
		}
		else
		{
			System.out.println("Odd no is" + intnumber);
		}

	}

}
