public class patern{
	public static void main(String[] args){
		int cnt=5;
		int cnt3=1;
		for(int i=1;i<=10;i++)
		{
			int cnt2=cnt3;
			for(int j=1;j<=cnt;j++)
			{
				if(i<=5)
				{
				System.out.print(cnt2);
				cnt2++;
				}
			}
			cnt3++;
			cnt--;
			
			
			
			
			
			
			if(i>5)
			{
				System.out.println(cnt2);
			cnt2--;	
			cnt++;
			}
		//else
			//cnt++;
			System.out.println();
			//cnt3++;
		}
	}
}