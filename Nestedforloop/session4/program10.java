/* Take the no of rows from the user  rows=4
   
   4 3 2 1
   C B A
   2 1
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
			int x=row-i;
                        for(int j=1;j<=row-i;j++){
				if(i%2==0){
					System.out.print(x+" ");
					x--;
				}else{
                                System.out.print((char)(ch-i+row-1)+" ");
                                ch--;
				}
                        }
                        System.out.println();
                }
        }
}
