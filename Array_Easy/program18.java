// Move all zero teo the end of array

import java.io.*;
import java.util.*;
class Moveall{

       	void  move(int arr[]){

               
			int j=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				j++;
			}

		}

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

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

                Moveall obj=new Moveall();
               obj.move(arr);


              
        }
}
