public class abc{
	public static void main(String[] args){
		int start=1;
		int end=5;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(j<start)
				    System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			if(i<5)
			{
				start++;
				end++;
			}
			else
			{
				start--;
				end--;
			}
		}
	}
}
