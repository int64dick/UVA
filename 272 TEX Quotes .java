package longlongdick;
import java.util.Scanner;

public class TEXQuotes 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = "";
		while(sc.hasNext())
		{
			s += sc.nextLine();
			s += "\n";
		}
		s = quote(s);
		System.out.print(s);
	}
	
	public static String quote(String s)
	{
		char[] arr = new char[s.length()];
		for(int i =0; i<s.length(); i++)
		{
			arr[i] = s.charAt(i);
		}
		int k = 1;
		String s2 = "";
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == '"' && (k%2) == 1)
			{
				s2 += "``";
				k++;
			}
			else if(arr[i] == '"' && (k%2) == 0)
			{
				s2 += "''";
				k++;
			}
			else
				s2 += arr[i];
		}
		s2 += ""+k;
		return s2;
	}

}

//謹慎使用一維字串或者使用其他方法去達成輸入條件
