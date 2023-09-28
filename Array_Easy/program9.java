// Find transition point

import java.io.*;
import java.util.*;
class Transition{

        void transition(int arr[]){
	
		int  index=Arrays.binarySearch(arr,1);
			
		if(index<0){
			index=-1;
		}
		System.out.println(index);
			

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

               

                Transition obj=new Transition();
                obj.transition(arr);

        }
}


