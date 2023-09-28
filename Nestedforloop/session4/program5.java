/* Take non of rows from the user ROWS=4
  

    4 3 2 1
    3 2 1
    2 1
    1

    */

import java.io.*;

class Xyz{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the rows:");

                int row=Integer.parseInt(br.readLine());

		for(int i=0;i<row;i++){
			for(int j=row-i;j>=1;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

