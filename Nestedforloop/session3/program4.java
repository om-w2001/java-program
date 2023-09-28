/* Take no of rows from the user     ROWS=4
   1
   1 2
   1 2 3 
   1 2 3 4
   */
class xyz{
	public static void main(String[] args){
		int rows=4;
		for(int i=1;i<=rows;i++){
			int num=1;
			for(int j=1;j<=i;j++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
