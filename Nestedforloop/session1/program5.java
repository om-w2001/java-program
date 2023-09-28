/* Tac=ke no of rows from the user 
 rows=3

 a b c
 d e f
 g h i

 */

class Star{
	public static void main(String[] args){
		int rows=3;
		char x='a';
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
	}
}
