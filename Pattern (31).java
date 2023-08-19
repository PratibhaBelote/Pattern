public class char1_1{
	public static void main(String[] args)
	{
		int pointer=6;
		for(int i=1;i<=6;i++)
		{
			int cnt=6;
			for(int j=1;j<=pointer;j++)
			{
				System.out.print((char)(cnt+64));
				cnt--;
			}
			pointer--;
			System.out.println();
		}
	}
}