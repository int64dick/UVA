package longlongdick;
import java.util.Scanner;










public class Shortshortdick 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String str = "";
		String str2 = "";
		for(int i=0; i<num; i++)
		{
			str = sc.nextLine();
			str2 = sc.nextLine();
			int p = i+1;
			if(gcd(add_two(str), add_two(str2)) == 1)
				System.out.println("Pair #"+""+p+": Love is not all you need!");
			else
				System.out.println("Pair #"+""+p+": All you need is love!");
			
		}
		
	}
	
	public static int add_two(String str)
	{
		int length = str.length();
		int sum = 0;
		for(int i=0; i<length; i++)
		{
			sum *= 2;
			sum += (int)str.charAt(i);
			sum -= '0';
		}
		return sum;
	}
	
	public static int gcd(int x, int y)
	{
		while(x!=0 && y!= 0)
		{
			if(x>y)
			{
				x %= y;
			}
			else 
				y %=x;
		}
		if(x>0)
			return x;
		else
			return y;
	}

}

 
