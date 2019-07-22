package longlongdick;
import java.math.BigInteger;
import java.util.Scanner;


public class Bigbigdick 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int num = sc.nextInt();
			sc.nextLine();
			String str = facto(num);
			int x = 0;
			for(int i=0; i<str.length(); i++)
			{
				x += str.charAt(i);
				x -= 48;
			}
			System.out.println(""+x);
		}
		
	}
	
	
	public static String facto(int num)
	{
		BigInteger a = new BigInteger("1");
		for(int i=1; i<= num; i++)
		{
			BigInteger b = new BigInteger(""+i);
			a = a.multiply(b);
		}
		return a.toString();
	}

}

//學習處理大數
//不過這邊稍嫌偷懶,僅使用java內建api:BigInteger


