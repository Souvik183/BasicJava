package PracticeQues3;

public class PowerOfANumber {

	public static void main(String[] args) {
		
		int base =3;
		int exponent=4;
		
		//1st way
		long result=1;
		while(exponent!=0)
		{
			result=result * base; //1*3=3
			exponent--;
			
		}
		System.out.println(result);
		
		//2nd way
		System.out.println(Math.pow(base, exponent));

	}

}
