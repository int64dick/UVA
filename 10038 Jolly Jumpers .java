package longlongdick;

import java.util.Arrays;
import java.util.Scanner;

public class jollydick 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int num = sc.nextInt();
			int[] arr = new int[num];
			for(int i = 0; i<arr.length; i++)
			{
				arr[i] = sc.nextInt();
			}
	
			int[] arr2 = new int [num-1];
			for(int i=0; i<arr2.length; i++)
			{
				arr2[i] = Math.abs(arr[i]-arr[i+1]);
			}
			
			if(isJolly(arr2))
				System.out.println("Jolly");
			else
				System.out.println("Not jolly");
			
		}
		
	}
	

	public static boolean isJolly(int[] arr)
	{
		
		for(int i = 1; i <= arr.length; i++)	
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[j] == i)
					break;
				if(j == arr.length-1)
					return false;
			}
			
		return true;
	}

}
// Math.abs可將數值轉成絕對值
