public class num3_5{
	public static void main(String[] args){
		int cnt=5;
		int cnt2=1;
		for(int i=1;i<=5;i++)
		{
			int cnt1=cnt2;
			for(int j=1;j<=cnt;j++)
			{
				System.out.print(cnt1);
				cnt1++;
				
			}
			System.out.println();
			cnt--;
			cnt2++;
		}
	}
}

