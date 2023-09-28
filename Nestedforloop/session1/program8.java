/* Take no of rows from the user
   rows=3;

   9 8 7
   6 5 4
   3 2 1


   */

class Star{
	public static void main(String[] args){
		int rows=3;
		int x=rows*rows;

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				System.out.print(x+" ");
				x--;
			}
			System.out.println();
		}
	}
}
