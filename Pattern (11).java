public class num4_2{
	public static void main(String[] args){
		int pointer=1;
		for(int i=1;i<=9;i+=2)
		{
			char ch='A';
			for(int j=1;j<=i;j++)
			{
				if(pointer>j)
				{
				System.out.print(ch);
				ch++;
				}
				else
				{
					System.out.print(ch);
					ch--;
				}
			}
			pointer++;
			System.out.println();
		}
	}
}