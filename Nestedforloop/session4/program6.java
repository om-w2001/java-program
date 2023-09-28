/*  Take no of rows from the user  ROWS=4
     

    a b c d
    a b c
    a b
    a

    */

import java.io.*;

class Xyz{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the rows:");

                int row=Integer.parseInt(br.readLine());

                for(int i=0;i<row;i++){
			char ch='a';
                        for(int j=row-i;j>=1;j--){
                                System.out.print(ch+" ");
				ch++;
                        }
                        System.out.println();
                }
        }
}

