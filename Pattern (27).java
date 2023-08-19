
public class MyClass 
{
	
	public static void main(String[] args) 
	{
		int start=1;
		for(int i=1;i<=5;i++)
		{
			int b=start;
			int cnt=4;
	
			for(int j=1;j<=start;j++)
			{
				
				System.out.print(b+" ");
				b=b+cnt;
				cnt--;
			
			}
			start++;
			System.out.println();
		}
	}
}

