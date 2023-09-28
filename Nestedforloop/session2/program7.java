/*Tack no of rows from the user ROWS =3
 A b C 
 d E f
 G h I
 */

class xyz{
	public static void main(String[] args){
		int rows=3;
		char x=65;
		char z=97;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(i%2==0){
					if(j%2==0){
						System.out.print((char)(x)+" ");
					}
					else{
						System.out.print((char)(z)+" ");
					}
				}
				else{
					if(j%2==0){
						System.out.print((char)(z)+" ");
					}
					else{
						System.out.print((char)(x)+" ");
					}
				}
				x++;
				z++;
			}
			System.out.println();
		}
	}
}
