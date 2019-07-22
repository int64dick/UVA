package longlongdick;
import java.util.Scanner;

public class Goaldick
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0; i<num; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			getValue(a, b);
		}
	}
	
	
	public static void getValue(int a, int b)
	{
		if(a < b)
		{
			System.out.println("impossible");
		}
		else
		{
			int d = (a-b)/2;
			if((a-b)%2 == 1)
			{
				System.out.println("impossible");
				return;
			}
			int c = d+b;
			System.out.println(""+c +" "+d);
		}
		
	}
}
//無啥重要
