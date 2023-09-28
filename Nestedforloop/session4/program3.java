/* Take no rows from the user  ROWS=4
    
    * * * *
    * * *
    * *
    *
    
 */
  

import java.io.*;
class Xyz{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Rows:");
		int row=Integer.parseInt(br.readLine());

		for(int i=0;i<row;i++){
			for(int j=row-i;j>=1;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
