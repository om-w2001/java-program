/* Take no of rows from the user
      ROWS=3;

      * * * 
      * * *
      * * *
      
      */

class Star{
	public static void main(String[] args){
		int rows=3;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
