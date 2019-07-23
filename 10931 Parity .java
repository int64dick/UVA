package longlongdick;
import java.util.Scanner;

public class Parity 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int n = sc.nextInt();
			if(n == 0)
				break;
			int[] arr = tenToTwo(n);
			int k = 0;
			for(int i = 0; i<arr.length; i++)
			{
				if(arr[i] == 1)
				{
					k++;
				}
			}
			System.out.print("The parity of ");
			for(int i = 0; i<arr.length; i++)
			{
				System.out.print(""+arr[i]);
			}
			System.out.print(" is "+""+k+" (mod 2).\n");
		}
	}
	
	public static int[] tenToTwo(int n)
	{
		int[] arr = new int[32];
		for(int j = 0; j<arr.length; j++)
		{
			arr[j] = 9;
		}
		int k = n;
		int i = 0;
		while(k > 0)
		{
			arr[i] = (k%2);
			k /= 2;
			i++;
		}
		i = 0;
		for(int j = 0; j<arr.length; j++)
		{
			if(arr[j] != 9)
				i++;
		}
		int[] arr2 = new int[i];
		for(int j = 0; j<i; j++)
		{
			arr2[j] = arr[j];
		}
		arr2 = reverse(arr2);
		return arr2;
	}
	
	public static int[] reverse(int[] arr)
	{
		int[] arr2 = new int[arr.length];
		int j = arr.length-1;
		for(int i = 0; i<arr.length; i++)
		{
			arr2[i] = arr[j];
			j--;
		}
		return arr2;
	}
}


//假如不確定陣列大小,先建立一個足夠大的陣列儲存,再自行判定使用的陣列長度並建立第二個陣列去作複製
//這題用字串會比陣列簡單
