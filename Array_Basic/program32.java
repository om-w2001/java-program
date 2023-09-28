// Maximize sum (arr[i]*i) of an array

import java.io.*;
import java.util.*;
class MaxSum{
        int  maxsum(int arr[]){
		int sum=0;
		
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i]*i;
		}
		return sum;

                
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
               
                MaxSum obj=new MaxSum();
                 
		Arrays.sort(arr);
                int num=obj.maxsum(arr);

               System.out.println("Maximize sum :"+num);
        }
}

