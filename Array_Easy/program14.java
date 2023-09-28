// Intersection of two array

import java.io.*;
import java.util.*;
class Intersection{

        void inter(int arr[],int arr2[]){
			
		int count=0;
                for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr[i]==arr2[j]){
					count++;
				}
			}
		}

		System.out.println("output :"+count);

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

                System.out.println("Enter the Array size:");
                int size2=Integer.parseInt(br.readLine());
			
		int arr2[]=new int[size2];
                System.out.println("Enter the element in array two:");

		for(int i=0;i<arr2.length;i++){
                	arr2[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		Arrays.sort(arr2);

                Intersection obj=new Intersection();
                obj.inter(arr,arr2);

        }
}


