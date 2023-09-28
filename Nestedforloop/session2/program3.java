/* Tack no of rows from the user 
   Input ROWS=4
  d d d d
  c c c c
  b b b b
  a a a a
 

*/
class alp{
	public static void main(String[] args){
		int rows=4;
		char x='a'+3;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				System.out.print(x+" ");
			}
			x--;
			System.out.println();
		}
	}
}
