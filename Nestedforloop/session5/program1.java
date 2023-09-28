/* Take no of rows from the user   rows=4
       
         1
       1 2
     1 2 3	
   1 2 3 4

   */

import java.io.*;
class Xyz{
	static void fun(int row){
	
		for(int i=1;i<=row;i++){
			int num=1;
			for(int j=row-1;j>=i;j--){
				System.out.print("  ");
			}
			for(int z=1;z<=i;z++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		
	
	}
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the rows:");

                int row=Integer.parseInt(br.readLine());

		 fun(row);

                
        }
}

