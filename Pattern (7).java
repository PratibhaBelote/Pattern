public class nine_space{
	public static void main(String[] args){
		for(int i=3;i<=11;i+=2)
		{
			for(int j=1;j<=i;j++)
			{
				if(j*2==i+1)
					System.out.print(" ");
				else
				System.out.print("*");
			}
			System.out.println();
		}
	}
}