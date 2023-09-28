/* Take no of rows from the user     ROWS=4
         10
	 I H
	 7 6 5
	 D C B A

	 */
class xyz{
	public static void main(String[] args){
		int rows=4;
		int x=(rows*(rows+1))/2;
		char z=65;

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				if(i%2==0){
					System.out.print((char)(z+(rows*(rows+1))/2-1)+" ");
				}
				else{
					System.out.print(x+" ");
				}
				z--;
				x--;
			}
			System.out.println();
		}
	}
}
