public class ass1{
	public static void main(String[] args){
		int cnt=4;
		int cnt2=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=cnt;j++)
			{
				System.out.print(" ");
			}
			cnt--;
			for(int j=1;j<=cnt2;j++)
			{
				
				System.out.print("*");
				
			}
			cnt2=cnt2+2;
			System.out.println();
		}
	}
}