// Key pair
//

import java.io.*;
class Keypair{

        boolean key(int arr[],int X){

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]+arr[j]==X){
					return true;
				}
			}
		}

		return false;
            }
        public static void main(String[] args) throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


                        System.out.println("Enter the Array Size:");
                        int size=Integer.parseInt(br.readLine());
                        int arr[]=new int [size];
                        System.out.println("Enter the element in array:");
                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }

		System.out.println("Enter the x value:");

		int X=Integer.parseInt(br.readLine());

                Keypair obj=new Keypair();
               boolean num= obj.key(arr,X);
			
	       System.out.println(num);

        }
}

