/* write the program to print the following pattern
 


	# = = = =
        = # = = =
	= = # = =
	= = = # =
	= = = = #


	*/

import java.io.*;
class Xyz{
	public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the rows:");

                int row=Integer.parseInt(br.readLine());
			
			int x=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(x==j){
					System.out.print("# ");
				}else{
					System.out.print("= ");
				}
			}
			x++;
			System.out.println();
		}

	}
}
