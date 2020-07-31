package PracticeQues;

public class LargestAmong3Numbers {

	public static void main(String[] args) {
		
		int a=10;
		int b=10;
		int c=10;
		
		if(a>=b && a>=c)
		{
			System.out.println(a);
		}
		else if(b>=a && b>=c)
		{
			System.out.println(b);
		}
		else if(c>=a && c>=b)
		{
			System.out.println(c);
		}
		
	}

}
