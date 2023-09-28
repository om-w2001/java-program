/*Take no of rows from the user  ROWS=4

D C B A
C B A
B A
A

*/

import java.io.*;

class Xyz{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the rows:");

                int row=Integer.parseInt(br.readLine());

                for(int i=0;i<row;i++){
                        char ch=65;
                        for(int j=1;j<=row-i;j++){
                                System.out.print((char)(ch-i+row-1)+" ");
				ch--;
                        }
                        System.out.println();
                }
        }
}


