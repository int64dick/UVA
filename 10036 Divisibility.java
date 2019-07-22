package longlongdick;
import java.util.Scanner;

public class Divisibility 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			int[] arr = new int[x];
			for(int j=0; j<x; j++)
				arr[j] = sc.nextInt();
			
			if(divi(y, arr) == true)
				System.out.println("Divisible");
			else
				System.out.println("Not divisible");
		}
	}
	
	public static boolean divi(int y, int[] arr)
	{
		
		int[][] arry = new int[arr.length][y];
		int s = arr[0]%y;
		if(s<0)
			s += y;
		arry[0][s] = 1;
		for(int i = 1; i<arry.length; i++)
		{
			for(int j = 0; j<arry[0].length; j++)
			{
				if(arry[i-1][j] == 1)
				{
					int z = arr[i];
					z %= y;
					if(z<0)
						z += y;
					int m = (j+z)%y;
					int n = (j-z)%y;
					if(n<0)
						n += y;
					arry[i][m] = 1;
					arry[i][n] = 1;
				}
			}
		}
		if(arry[arry.length-1][0] == 1)
			return true;
		return false;
	}
}

//了解動態規劃,當新的狀態是與舊的狀態息息相關時
//利用二維矩陣達成目的,COL決定新舊狀態,ROW決定狀態內容
