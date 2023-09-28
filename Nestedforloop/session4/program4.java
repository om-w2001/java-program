/* Take no of rows from the user  ROWS=4
 
   1 2 3 4
   5 6 7
   8 9
   10


   */

import java.io.*;

class Xyz{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the rows:");

		int row=Integer.parseInt(br.readLine());
		
		int num=1; 

		for(int i=0;i<row;i++){
			for(int j=row-i;j>=1;j--){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
