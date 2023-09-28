/* Take no of rows from the user 
  Input ROWS=3;
 1 4 7
 10 13 16
 19 22 25

*/

class Three{
	public static void main(String[] args){
		int rows=3;
		int z=1;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				System.out.print(z+" ");
				z=z+3;
			}
			System.out.print("\n");
		}
	}
}

