package sample;

public class Pattern {
	/*triangle from 10 to 1
	10
	9 8
	7 6 5
	4 3 2 1
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=4,kk=10;
		for(int i=1;i<n+1;i++)
		{
			System.out.println(" ");
			for(int j=0;j<i;j++)
			{
				System.out.print(+kk--);
				System.out.print(" ");
			}
		}
		System.out.println();
		System.out.println("------");
	/*
		1
		22
		333
		4444
		55555
		
		for(int k=1;k<=5;k++)
		{
			System.out.println();
			for(int l=1;l<=k;l++)
			{
				System.out.print(+k);
			}
		}
		*/
/*
		10 9 8 7 
		6 5 4 
		3 2 
		1 
	*/	
		int k=10;
		for(int i=1;i<=5+1;i++)
		{
			System.out.println();
			for(int j=5;j>i;j--)
			{
				System.out.print(+k--);
				System.out.print(" ");
			}
		}
	}

}
