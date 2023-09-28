/*  Take no of rows from the user     ROWS=4
      1
      2 4
      3 6 9
      4 8 12 16
       */

class xyz{
	public static void main(String[] args){
	int rows=4;
	for(int i=1;i<=rows;i++){
		int num=i;
		for(int j=1;j<=i;j++){
			System.out.print(num*j+" ");
			
		}
		System.out.println();
	}
	}
}
