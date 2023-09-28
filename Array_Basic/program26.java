// positive and negative element


import java.util.*;
import java.io.*;
class Posneg{
        void posneg(int arr[]){
         
	 for(int i=0;i<arr.length;i++){	
		if(i%2==0){
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			}
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
                        
		Posneg obj=new Posneg();
                obj.posneg(arr);
		System.out.println("Output:");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

        
        }
}

