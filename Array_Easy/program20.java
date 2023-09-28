//Bitonic point

import java.io.*;
import java.util.*;
class Bitonic{

        int bitonic(int arr[]){
		/*int max=arr[0];

		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}

		System.out.println(max);
		*/

		int start=1;
		int end=arr.length-2;

	

		while(start<=end){
			int mid=(start+end)/2;

			if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){

				return arr[mid];
			}else if(arr[mid]< arr[mid+1]){
				start=mid+1;
			}else{
				end=mid-1;
			}
		}

		return -1;


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

                Bitonic obj=new Bitonic();
            int num=   obj.bitonic(arr);

	    System.out.println(num);


		
        }
}

