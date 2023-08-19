public class num5_2{
	public static void main(String[] args){
		int start=5;
		int end=5;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j<=start || j>=end )
					System.out.print("*");
			    else
				System.out.print(" ");
			}
			if(i<5)
			{
			 start--;
			 end++;
			}
			else
			{
				start++;
				end--;
			}
			System.out.println();
		}
	}
}