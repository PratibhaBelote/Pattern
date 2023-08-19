public class chavansir_pattern{
	public static void main(String[] args){
		int pointer=5;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=pointer;j++)
			{
				if(j==pointer)
					System.out.print("*");
			}
			pointer--;
			
			int pointer1=2;
			for(int j=1;j<=pointer1;j++)
			{
				System.out.print("*");
			}
			pointer1++;
			System.out.println();
		}
	}
}