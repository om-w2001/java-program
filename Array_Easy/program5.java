// peak element

import java.io.*;
import java.util.*;
class Peak{

        int peak(int arr[]){
			
		for(int i=1;i<arr.length;i++){
			if(arr[i-1]<arr[i]){
				return i;
			}
		}

		return 0;
			

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

                
                Peak obj=new Peak();
               int num= obj.peak(arr);

	       System.out.println(num);

        }
}

