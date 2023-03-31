class Pattern18{
 public static void main(String args[]){
   int alpa = 65;
  for(int i = 5 ; i>=1 ; i--)
  {
    for(int j = 0 ; j < i ; j++)
	{
	  System.out.print((char)(alpa+j)+" ");
	}
	System.out.println();
  }
 }
 }