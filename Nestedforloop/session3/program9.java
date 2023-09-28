/* Take no of rows from the user     ROWS=3
     3
     6 9
     12 15 18
 
     ROWS=4
       
     4
     8 12 
     16 20 24
     28 32 36 40
      
     */
class xyz{
	public static void main(String[] args){
		int rows=4;
		int num=1;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(rows*num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
