package longlongdick;
import java.util.Scanner;
import java.util.Arrays;


public class Keyboarddick
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String arr = "";
			arr = sc.nextLine();
			for(int i=0; i<arr.length(); i++)
			{
				System.out.print(""+keyboard(arr.charAt(i)));
			}
			System.out.print("\n");
		}
	}
	
	
	public static char keyboard(char c)
	{
		if(c >= 'A' && c <= 'Z')
		{
			c += 32;
			String str = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
			for(int i = 2; i < str.length(); i++)
			{
				if(str.charAt(i) == c) 
				{
					c = str.charAt(i-2);
				}				
			}
			c -= 32;
			return c;
		}
		else
		{
			String str = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
			if(c == '`' || c == '1')
				return c;
			for(int i = 2; i < str.length(); i++)
			{
				if(str.charAt(i) == c) 
				{
					c = str.charAt(i-2);
				}				
			}
			return c;
		}
		
	}
}

//開始明白一個物件的特性,當我建構出一個字串能表達鍵盤上的字元時,該字串便如同鍵盤一樣
