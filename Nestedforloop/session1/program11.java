/* Take no of rows from the user
   rows=4


   1 2 3 4
   a b c d
   5 6 7 8
   e f g h



 */

class Star{
	public static void main(String[] args){
		int rows=4;
		int x=1;
		char z='a';

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(i%2==0){
					System.out.print(z+" ");
					z++;
				}
				else{
					System.out.print(x+" ");
					x++;
				}
			}
			System.out.println();
		}
	}
}
