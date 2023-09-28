/* Take no of rows from the user  ROWS=5
   

   1 2 3 4 5
   2 3 4 5
   3 4 5
   4 5
   5

   */
import java.io.*;

class Xyz{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the rows:");

                int row=Integer.parseInt(br.readLine());

                for(int i=0;i<row;i++){
			int num=i+1;
                        for(int j=1;j<=row-i;j++){
                                System.out.print(num+" ");
				num++;
                        }
                        System.out.println();
                }
        }
}

