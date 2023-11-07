package A1;

public class Reverse_number
{
	//reverse number
	public static void main(String[] args) 
	{
		int num=123456;
		int rem=0;
		int rev=0;
		
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		
	}

}
