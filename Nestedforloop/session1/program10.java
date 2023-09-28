/* Take no of rows from the user 
  rows =3;

  1 3 5 
  7 9 11
  13 15 17


  */

class Star{
	public static void main(String[] args){
		int rows=3;
		int x=1;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				System.out.print(x+" ");
				x=x+2;
			}
			System.out.println();
		}
	}
}
