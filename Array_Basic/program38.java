// Immediate smaller element

import java.io.*;
class Immediate{

        void immediate(int arr[]){
                
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				System.out.println(arr[i+1]+" ");
			}if(arr[i]<arr[i+1]){
				System.out.println(-1);
			}
		}
		System.out.println(-1);
        }
         public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the size");
                int size=Integer.parseInt(br.readLine());

                int arr[]=new int[size];


                System.out.println("Enter the Array1:");
                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }

                Immediate obj=new Immediate();
                obj.immediate(arr);
         }
}


