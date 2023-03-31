class Pattern8{
public static void main(String args[])
	{
		
		int row=5;
		
				for (int i=1; i<=row; i++)
			{
					for (int j=1; j<=row-i; j++)
				{
					System.out.print(" ");
				}
				for (int k=row-i+1; k<=row; k++)
					{
						System.out.print(k+" ");
					}
					System.out.println();
			}
	}
	}