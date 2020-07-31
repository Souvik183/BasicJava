package PracticeQues;

public class SwpTwoNumbers {

	public static void main(String[] args) {
		
		
		/*int a=10;
		int b=20;
		
		System.out.println("Before Swapping");
		System.out.println("value of a is:" +a);
		System.out.println("value of b is:" +b);
		
		
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping");
		System.out.println("value of a is:" +a);
		System.out.println("value of b is:" +b);*/
		
		//Without temporary variable
		int a=10;
		int b=20;
		
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("After Swapping");
		System.out.println("value of a is:" +a);
		System.out.println("value of b is:" +b);
		
	}

}
