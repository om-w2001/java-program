/* Take no of rows from the user 
    rows=4;


    4 4 4 4
    3 3 3 3
    2 2 2 2
    1 1 1 1


    */

class Star{
	public static void main(String[] args){
		int rows=4;
		int x=rows;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				System.out.print(x+" ");
			}
			x--;
			System.out.println();
		}
	}
}
