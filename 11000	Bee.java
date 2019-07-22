import java.util.Scanner;


public class BeeDick 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = 0;
		while(true)
		{
			N = sc.nextInt();
			if(N <= -1)
			{
				break;
			}
			long[] arr = Bee(N);
			System.out.println(""+arr[0]+ " "+arr[1]);
		}
	}
	
	public static long[] Bee(int N)
	{
		long[] arr = new long[2];
		long male = 0;
		long female = 0;
		long copyMale = 0;
		long copyFemale = 0;
		for(int i= 0; i<N; i++)
		{
			female += copyMale;
			male += copyFemale;
			female -= copyFemale;
			male++;
			copyMale = male;
			copyFemale = female;
			
		}
		arr[0] = male;
		arr[1] = male+female+1;
		return arr;
	}

}
//利用回傳陣列完成兩個傳回值的需求
