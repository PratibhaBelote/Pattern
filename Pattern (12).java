public class num4_3{
	public static void main(String[] args){
		int end=5;
		int start=5;
		for(int i=1;i<=5;i++)
		{
			int cnt=1;
			for(int j=1;j<=end;j++)
			{
				if(j<start)
				{
					System.out.print(" ");
				}
				else
				{
					if(j<5)
					{
				      System.out.print(cnt);
					  cnt++;
					}
					else
					{
						System.out.print(cnt);
						cnt--;
					}
				}
			}
			end++;
			start--;
			System.out.println();
		}
	}
}