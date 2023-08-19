public class patern{
	public static void main(String[] args){
		int cnt=1;
		//int cnt2=5;
		for(int i=1;i<=5;i++)
		{
			int cnt1=5;
			for(int j=1;j<=cnt;j++)
			{
				System.out.print(cnt1);
				cnt1--;
			}
			cnt++;
			//cnt2--;
			System.out.println();
		}
	}
}