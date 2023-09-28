// Union of two sorted Array

import java.io.*;
import java.util.*;
class Union{

        void union(int arr[],int arr2[]){

                HashSet<Integer> hs =new HashSet<>();

		for(int i=0;i<arr.length;i++){
			hs.add(arr[i]);
		}

		for(int i=0;i<arr2.length;i++){
			hs.add(arr2[i]);
		}

		Iterator it= hs.iterator();
		System.out.println("output");

		while(it.hasNext()){

			int s=(int)it.next();
			System.out.println(s);
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

                System.out.println("Enter the array size2:");
                int size2=Integer.parseInt(br.readLine());

		int arr2[]=new int[size2];

                System.out.println("Enter the element in array two:");
			for(int i=0;i<arr2.length;i++){
                		arr2[i]=Integer.parseInt(br.readLine());
			}

                Union obj=new Union();
                obj.union(arr,arr2);

        }
}


