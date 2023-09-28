/* Take no of rows from the user     ROWS=4
    c
    b b
    a a a

      */

class xyz{
	public static void main(String[] args){
		int rows=3;
		char x=97;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print((char)(x+rows-1)+" ");
			}
			x--;
			System.out.println();
		}
	}
}

