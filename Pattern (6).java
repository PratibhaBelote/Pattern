public class nine_nine{
	public static void main(String[] args){
		int start=5;
		int end=9;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(j<start)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			if(i<5)
			{
				start--;
				end--;
			}
			else
			{
				
				start++;
				end++;
			}
			System.out.println();
		}
	}
}