public class GCD
{
	public static void main(String args[])
	{
		int a=20,b=30;
		int i,gcd=1;

		for(i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{gcd=i;
				}
		}

	System.out.printf("GCD of %d & %d is %d",a,b,gcd);
	}
}
