class Pattern5{
 public static void main(String args[]){
  char c = 'A';
  for(int i = 1 ; i <= 5 ; i++ , c++)
  { 
    for(int j = 1 ; j<= i ; j++)
   {
    System.out.print(c + " ");
   }
	System.out.println();
  }
 
 }
}
