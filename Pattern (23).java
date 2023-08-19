public class rav_num_pattern{
	public static void main(String[] args){
		int count=5;
		int row=1;
		for(int i=0;i<5;i++)
		{
			int col=row;
			for(int j=0;j<count;j++)
			{
				System.out.print(col);
				col++;
			}
			count--;
			System.out.println();
			row++;
		}
	}
}