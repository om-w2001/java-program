/* Take no of rows from the user 
  ROWS=4
 	

  	1 2 3 4
	1 2 3
	1 2
	1
	*/

import java.io.*;
class Xyz{
	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the rows:");
		int rows=Integer.parseInt(br.readLine());

		for(int i=0;i<rows;i++){
			int num=1;
			for(int j=rows-i;j>=1;j--){
				System.out.print(num +" ");
				num++;
			}
			System.out.println();
		}
	}
}
