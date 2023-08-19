public class num_pattern{
	public static void main(String[] args){
		int count1=1;
		int pcount=0;
		for(int i=0;i<5;i++)
		{
			pcount=1;
			for(int j=0;j<count1;j++)
			{
				System.out.print(pcount);
				pcount++;
			}
			count1++;
			System.out.println();
		}
	}
}