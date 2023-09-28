/* Take no of rows from the user  rows=4
     

   1 2 3 4
   4 5 6
   6 7
   7

   */

import java.io.*;

class Xyz{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the rows:");

                int row=Integer.parseInt(br.readLine());
			int x=1;
                for(int i=0;i<row;i++){
                        for(int j=1;j<=row-i;j++){
                                System.out.print(x+" ");
                                x++;
                        }
			x--;
                        System.out.println();
                }
        }
}
