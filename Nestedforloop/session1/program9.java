/*Take no of rows from the user 
  rows=3

  A A A 
  B B B
  C C C

  */
class Star{
	public static void main(String[] args){
		int rows=3;
		char x='A';
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				System.out.print(x+" ");
			}
			x++;
			System.out.println();
		}
	}
}
