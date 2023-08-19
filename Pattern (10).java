public class num4{
	public static void main(String[] args){
		int pointer=1;
		for(int i=1;i<=9;i+=2)
		{
			int cnt=1;
			for(int j=1;j<=i;j++)
			{
				if(pointer>j)
				{
				System.out.print(cnt);
				cnt++;
				}
				else
				{
					System.out.print(cnt);
					cnt--;
				}
			}
			pointer++;
			System.out.println();
		}
	}
}