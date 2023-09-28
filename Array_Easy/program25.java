// Even and odd

import java.io.*;
import java.util.*;
class Evenodd{

        int[]  evenodd(int arr[]){
		
		int arr2[]=new int[arr.length];
			
		int j=0;
		int z=1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				arr2[j]=arr[i];
				j=j+2;
			}else{
				arr2[z]=arr[i];
				z=z+2;
			}
		}

		System.out.println("Explanation");

		for(int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}
		return arr2;


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

                Evenodd obj=new Evenodd();
              int[] arr2= obj.evenodd(arr);


        }
}

