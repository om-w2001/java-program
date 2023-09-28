// count pair with give sum


import java.io.*;
import java.util.*;
class Countpairsum{

        void sum(int arr[],int k){
		int count=0;

		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(arr[i]+arr[j]==k){
					count++;
				}
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

                int k=Integer.parseInt(br.readLine());
			
                Countpairsum obj=new Countpairsum() ;
 		obj.sum(arr,k);

        }
}

