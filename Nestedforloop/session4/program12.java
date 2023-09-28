/* Take the no rows from the user  rows=4
 
     
   4 3 2 1
   4 3 2
   4 3
   4

   */

import java.io.*;

class Xyz{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the rows:");

                int row=Integer.parseInt(br.readLine());

                for(int i=0;i<row;i++){
			int x=row;
                        for(int j=1;j<=row-i;j++){
                                System.out.print(x+" ");
                                x--;
                        }
                        System.out.println();
                }
        }
}
