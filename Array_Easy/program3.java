// find duplicates in array


import java.io.*;
import java.util.*;
class Duplicates{

	void duplicates(int arr[]){
		/*
		int arr2[]=new int[arr.length-1];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					arr2[arr[i]]++;
				}
			}
		
		}
		
		System.out.println();
		for(int i=0;i<arr2.length;i++){
			if(arr2[i]>1){
				System.out.println(i);
			}
		}
		*/
			Arrays.sort(arr);
		for(int i=1;i<arr.length-1;i++){
			if(arr[i]==arr[i+1]){
				System.out.println(arr[i+1]);
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

		Arrays.sort(arr);

		Duplicates obj=new Duplicates();
		obj.duplicates(arr);

	}
}
