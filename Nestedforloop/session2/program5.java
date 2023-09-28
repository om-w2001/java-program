/*Take no of rows from the user ROWS=3
    1 2 3 
    2 3 4 
    3 4 5
    */

class xyz{
	public static void main(String[] args){
		int rows=3;
		for(int i=1;i<=rows;i++){
			int num=i;
			for(int j=1;j<=rows;j++){
				System.out.print(num+" ");
				num++;
			}
			System.out.print("\n");
		}
	}
}
