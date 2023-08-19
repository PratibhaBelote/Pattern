public class ass1{
	public static void main(String[] args){
		int cnt1=1;
		int cnt2=9;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<cnt1;j++)
			{
				System.out.print(" ");
			}
			cnt1++;
			for(int j=1;j<=cnt2;j++)
			{
				System.out.print("*");
			}
			cnt2 -=2;
			System.out.println();
		}
		int cnt3=3;
		int cnt4=3;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=cnt3;j++)
			{
				System.out.print(" ");
			}
			cnt3--;
			for(int j=1;j<=cnt4;j++)
			{
				System.out.print("*");
			}
			cnt4 +=2;
			System.out.println();
		}
	}
}
		