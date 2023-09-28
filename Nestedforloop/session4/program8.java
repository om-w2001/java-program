/* Take no rows from the user   rows=4
 
   d d d d
   C C C
   b b
   A

   rows=3

   c c c
   B B
   a

   */
import java.io.*;
class Xyz{
	public static void main(String[] args)throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the rows:");

	int row=Integer.parseInt(br.readLine());

	char ch=97;
	char ch1=65;

	for(int i=0;i<row;i++){
		for(int j=1;j<=row-i;j++){
			if(i%2==0){
		System.out.print((char)(ch1+row-1)+" ");
			}
			else{
				System.out.print((char)(ch+row-1)+" ");
				}
		}
		ch--;
		ch1--;
		System.out.println();
	}	
	}
}
