/* Take no of rows from the user     ROWS=4
     a
     b c 
     d e f
     g h i j


     */
class xyz{
	public static void main(String[] args){
		int rows=4;
		char x=97;

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
	}
}
