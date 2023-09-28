/* Take no of rows & cols from the user
   Rows=3;
   col=4;
     
    
   1 2 3 4 
   5 6 7 8 
   9 10 11 12

   */

class Num{
	public static void main(String[] args){
		int rows=3;
		int col=4;
		int num=1;

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=col;j++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}

