/* write a program to print the following pattern
        row=5

       O
      14 13
       L K J
       9 8 7 6
       E D C B A       
	
       ROW=4

       10
       I  H
       7 6 5
       D C B A
       */
import java.io.*;
class xyz{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the rows:");

                int rows=Integer.parseInt(br.readLine());
		int x=(rows*(rows+1))/2;
		char z=65;

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				if(rows%2==0){
				if(i%2==0){
					System.out.print((char)(z+(rows*(rows+1))/2-1)+" ");
				}
				else{
					System.out.print(x+" ");
				}
				z--;
				x--;
			}else{
				if(i%2!=0){
                                        System.out.print((char)(z+(rows*(rows+1))/2-1)+" ");
                                }
                                else{
                                        System.out.print(x+" ");
                                }
                                z--;
                                x--;
			}
			}
		
			System.out.println();

			
		}
	}
}
