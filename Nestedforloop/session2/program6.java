/*Take no of rows from the user ROWS=4
   D D D D
   C C C C
   B B B B
   A A A A
   */
class xyz{
	public static void main(String[] args){
		int rows=4;
		char x= 65;

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				System.out.print((char)(x+rows-1)+" ");
			}
			x--;
			System.out.print("\n");
		}
	}
}
