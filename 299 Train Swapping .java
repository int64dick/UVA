package longlongdick;
import java.util.Scanner;

public class Train_Swapping 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++)
		{
			int m = sc.nextInt();
			int[] arr = new int[m];
			for(int j = 0; j<m; j++)
			{
				arr[j] = sc.nextInt();
			}
			System.out.println("Optimal train swapping takes "+""+bubbleTime(arr)+" swaps.");	
		}
			
	}
	
	public static int bubbleTime(int[] arr)
	{
		int time = 0;
		for(int i =0; i<arr.length-1; i++)
		{
			for(int j = 0; j<arr.length-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int m = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = m;
					time++;
				}
			}
		}
		return time;
	}
}
//無甚難度
