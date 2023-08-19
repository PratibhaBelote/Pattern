public class start_star{
	public static void main(String[] args)
	{
		int count1=0;
		int count2=5;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<count1;j++)
			{
				System.out.print(" # ");
			}
			count1++;
			
			for(int j=0;j<count2;j++)
			{
				System.out.print(" * ");
			}
			count2--;
			System.out.println();
		}
	}
}