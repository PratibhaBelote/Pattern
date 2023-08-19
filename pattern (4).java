public class last_star{
public static void main(String[] args)
{
	int count=4;
	int count2=1;
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<count;j++)
		{
			System.out.print(" ");
		}
		count--;
		
		for(int j=0;j<count2;j++)
		{
			System.out.print ("*");
		}
		count2++;
		System.out.println( );
	}
}
}