/* write a program to print the following pattern
 
   rows=8;

   $
   @ @
   & & &
   # # # #
   $ $ $ $ $
   @ @ @ @ @ @
   & & & & & & &
   # # # # # # # #


   */
import java.io.*;
class Xyz{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the rows:");

                int row=Integer.parseInt(br.readLine());

                   char ch='$';
                for(int i=1;i<=row;i++){
                        for(int j=1;j<=i;j++){
				System.out.print(ch+" ");
			}
			switch(ch){
				case '$':
					ch='@';
					break;
				case '@':
					ch='&';
					break;
				case '&':
					ch='#';
					break;
				case '#':
					ch='$';
					break;
			}
			System.out.println();
		}
	}
}	



