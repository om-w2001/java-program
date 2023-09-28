/* write a program to print the following pattern
  row=4

  0
  1 1
  2 3 5
  8 13 21 34


  */


import java.io.*;
class Xyz{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the rows:");

                int row=Integer.parseInt(br.readLine());

                        int a=0;
			int b=1;
			int c=a+b;
                for(int i=1;i<=row;i++){
                        for(int j=1;j<=i;j++){
                                if(i==1&&j==1){
					System.out.print(a+" ");
				}
				else if(i==2&&j==1){
					System.out.print(b+" ");
				}else{
					System.out.print(c+" ");
					a=b;
					b=c;
					c=a+b;
				}

                                        
                        }
			System.out.println();
                }

        }
}


