/* WAP to print the factorial of each number between a given range
        start=1
	end=5
 */

import java.io.*;

class Xyz{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the start:");

                int start=Integer.parseInt(br.readLine());
		System.out.println("Enter the end:");

                int end=Integer.parseInt(br.readLine());
                for(int i=start;i<=end;i++){
			int fact=1;
                        for(int j=1;j<=i;j++){
                                fact=fact*j;
                                
                        }
			System.out.println((fact) );
                        System.out.println();
                }
        }
}
