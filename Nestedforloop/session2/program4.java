/* Take no of Rows from the user     ROWS=3
    a B c
    d E f
    g H i
    */
class xyz{
	public static void main(String[] args){
	int rows=3;
	char x='a';
	char z='A';

	for(int i=1;i<=rows;i++){
		for(int j=1;j<=rows;j++){
			if(j%2==0){
				System.out.print(z+" ");
			}else{
				System.out.print(x+" ");
			}
			x++;
			z++;
		}
		System.out.print("\n");
	}
	}
}
