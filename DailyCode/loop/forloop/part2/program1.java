/* 
 * write the program to print the following pattern
  
      D4 C3 B2 A1
      A1 B2 C3 D4
      D4 C3 B2 A1
      A1 B2 C3 D4


      */
import java.io.*;
class Xyz{
	public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the rows:");

                int row=Integer.parseInt(br.readLine());
			
		
		 for(int i=1;i<=row;i++){
			 char ch1=65;
                        char ch2=65;
                        int num1=1;
                        int num2=row;
			 for(int j=1;j<=row;j++){
				 if(i%2==0){
					 System.out.print((char)ch1);
					 System.out.print(num1+" ");
					 ch1++;
					 num1++;
				 }else{
					 System.out.print((char)(ch2+row-1));
					 System.out.print(num2+" ");
					 ch2--;
					 num2--;
				 }
			 }
			 System.out.println();

                
        }
}
}
