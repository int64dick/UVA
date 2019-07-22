import java.util.Scanner;

public class SymmetricDick 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<n; i++)
		{
			String[] s = sc.nextLine().split(" ");
			int N = Integer.parseInt(s[2]);
			long[][] arr = new long[N][N];
			
			for(int j = 0; j<N; j++)
			{
				Scanner ics = new Scanner(sc.nextLine());//重要
				for(int k = 0; k<N; k++)
				{
					arr[j][k] = ics.nextLong();
				}
			}
			
			if(symmetric(arr, N) == true)
			{
				System.out.println("Test #"+""+(i+1)+": Symmetric.");
			}
			else
				System.out.println("Test #"+""+(i+1)+": Non-symmetric.");
			
		}
	}
				
	public static boolean symmetric(long[][] arr, int N)
	{
		for(int i = 0; i<N; i++)
		{
			for(int j = 0; j<N; j++)
			{
				if(arr[i][j] <0)
					return false;
				if(arr[i][j] != arr[N-i-1][N-j-1])
				{
					return false;
				}
			}
		}
		return true;
	}
}
//本解答有超出時間限制的問題,需再作優化調整
//雙重Scanner,輔助我一次讀取整行避免換行符號造成的出錯
//盡量以布林值作為回傳值以決定是非判斷的列印,而不是在api作列印
//多學習一個split作為字串分割的工具,split是在nextLine()的子工具裡
//多學習Integer.parseInt(字串) 方便我將字串轉成其他型態
