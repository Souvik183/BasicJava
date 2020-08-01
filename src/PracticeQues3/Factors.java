package PracticeQues3;

public class Factors {

	public static void main(String[] args) {
		
		//factors means==> Factors of 10 are= 1,2,5,10
		
		int num=10;
		for(int i=1; i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i+ ": Factors of the number you entered");
			}
		}

	}

}
