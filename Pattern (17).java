public class one_two_pattern{
	public static void main(String[] args){
		for(int i=1;i<=5;i++)
		{
			int cnt=5;
			for(int j=1;j<=i;j++)
			{
				System.out.print(cnt);
				cnt--;
			}
			System.out.println();
		}
	}
}