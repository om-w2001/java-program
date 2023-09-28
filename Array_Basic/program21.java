// first element to occur k time

import java.io.*;
import java.util.*;
class Firstele{
	int  firstele(int arr[],int k){
		int arr2[]=new int[200];
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					arr2[arr[i]]++;
				}
			}
		}
		for(int i=0;i<arr2.length;i++){
			if(arr2[i]%k==0&& arr2[i]!=0){
				return i;
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
		System.out.println("Enter the k element:");
			int k=Integer.parseInt(br.readLine());
		Firstele obj=new Firstele();
		Arrays.sort(arr);
		int num=obj.firstele(arr,k);

		System.out.println("First element to occur k time :"+num);
	}
}

