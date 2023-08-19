public class top_bottom{
	public static void main(String[] args)
	{
		int count=1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<count;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
			count++;
		}
	}
}