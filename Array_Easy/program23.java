// Three Great candidates

import java.io.*;
import java.util.*;
class Great3can{

        void  great(int arr[]){

		int start=arr.length-3;
			
		int mult=1;
		for(int i=start;i<arr.length;i++){
				mult=mult*arr[i];
		}
			
		System.out.println(mult);
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
			
		Arrays.sort(arr);
                Great3can obj=new Great3can();
               obj.great(arr);



        }
}
