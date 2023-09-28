// Element with left side smaller and right side greater


import java.io.*;
import java.util.*;
class Elementleft{

        int  right(int arr[]){

		for(int i=1;i<arr.length-1;i++){
			if(arr[i]>arr[i-1]&& arr[i]<arr[i+1]){
				return arr[i];
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

               Elementleft obj=new Elementleft();
              int num= obj.right(arr);

	      System.out.println(num);

        }
}
