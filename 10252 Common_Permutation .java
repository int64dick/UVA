package longlongdick;
import java.util.Scanner;

public class Common_Permutation 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			char[] a1 = new char[s1.length()];
			char[] a2 = new char[s2.length()];
			for(int i =0; i<s1.length(); i++)
			{
				a1[i] = s1.charAt(i);
			}
			for(int i =0; i<s2.length(); i++)
			{
				a2[i] = s2.charAt(i);
			}
			String s3 = same(a1, a2);
			System.out.println(s3);
		}
	}
	
	
	public static String same(char[] s1, char[] s2)
	{
		String s3 = "";
		for(int i = 0; i < s1.length; i++)
		{
			for(int j = 0; j < s2.length; j++)
			{
				if(s1[i] == s2[j])
				{
					s3 += s1[i];
					s2[j] = '0';
					break;
				}		
			}
		}
		
		s3 = sort(s3);
		return s3;
	}
	
	public static String sort(String s)
	{
		for(int i = 0; i < s.length()-1; i++)
		{
			String t = "";
			char ch = s.charAt(0);
			for(int j = 1; j < s.length(); j++)
				if(s.charAt(j) > ch)
				{
					t += ch;
					ch = s.charAt(j);
				}
				else
					t += s.charAt(j);
			t += ch;
			s = t;
				
		}
		
		return s;
		
	}
}

//replace() 方法通过用 newChar 字符替换字符串中出现的  "所有"    oldChar字符，并返回替换后的新字符串。
//String無法更改內容物,所以該使用char[] 代替
//氣泡排序與選擇排序類似 但氣泡排序在每次尋找最大或最小值時,其他數值會如氣泡般浮出
