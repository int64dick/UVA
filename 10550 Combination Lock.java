import java.util.Scanner;


public class LockDick 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		while(true)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			if(a == 0 && b == 0 && c == 0 && d == 0)
				break;
			System.out.println(""+dial(a, b, c, d));
		}
	}
	
	public static int dial(int a, int b, int c, int d)
	{
		int dial = 1080;
		if(a >= b)
			dial += ((a-b)*9);
		else
			dial += ((40-b+a)*9);
		if(c >= b)
			dial += ((c-b)*9);
		else
			dial += ((40-b+c)*9);
		if(c >= d)
			dial += ((c-d)*9);
		else
			dial += ((40-d+c)*9);
		
		return dial;		
	}
}
//沒甚麼難度,僅需注意題目附圖以明確瞭解題目所需
