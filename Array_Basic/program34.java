// print an array in pendulum Arrangement

import java.io.*;
import java.util.*;
class Pendulum{
        void  pendulum(int arr[]){
		int arr2[]=new int[arr.length];
			
		 Arrays.sort(arr);
		
		int mid=(arr.length-1)/2;

		int j=1,i=1;
		int n=arr.length;

		arr2[mid]=arr[0];

		for( i=1;i<=mid;i++){
			arr2[mid+i]=arr[j++];
			arr2[mid-i]=arr[j++];
		}
		if(n%2==0){
			arr2[mid+i]=arr[j];
		}

		System.out.println("Pendulum arrangement");
		for( i=0;i<arr.length;i++){
			System.out.println(arr2[i]);
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
                
                Pendulum obj=new Pendulum();
                
                obj.pendulum(arr);

                
        }
}

