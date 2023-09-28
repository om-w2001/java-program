// Facing the sun

import java.io.*;
import java.util.*;
class Facingsun{

        void  sun(int arr[]){

		int rises=arr[0];
		int count=1;

		for(int i=1;i<arr.length;i++){
			if(rises<arr[i]){
				count++;
				rises=arr[i];
			}
		}
			
		System.out.println(count);

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

                Facingsun obj=new Facingsun();
               obj.sun(arr);



        }

}
