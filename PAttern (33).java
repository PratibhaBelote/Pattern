public class chavhan_pattern_ifelse{
	 static public void main(String[] args)
	{
		int cont=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j>=cont)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			cont++;
			System.out.println();
		}
	}
}
				