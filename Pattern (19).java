public class pat{
	public static void main(String[] args){
		int cnt=1;
		int pointer=5;
		for(int i=1;i<=5;i++)
		{
			//int cnt2=cnt;
			for(int j=1;j<=i;j++)
			{
				System.out.print(cnt+i);
				//cnt2++;
			}
			pointer--;
			cnt++;
			System.out.println();
		}
	}
}