// Binarysearch

import java.io.*;

class binsearch{

	int bin(int arr[] ,int x){
		int start=0;
		int end=arr.length-1;

		while(start<=end){

			int mid=(start+end)/2;
			if(arr[mid]==x){
				return mid;
			}else if(arr[mid]<x){
				start=mid+1;
			}else{
				end=mid-1;
			}
		}
		return -1;
	}


	
	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size the array:");
			int size=Integer.parseInt(br.readLine());
		int arr[] =new int [size];
			
			System.out.println("Enter the element of the array:");

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter the number to find:");
		int x=Integer.parseInt(br.readLine());
			binsearch obj=new binsearch();
		int num=obj.bin(arr,x);

		if(num==-1){
			System.out.println(x+"is not present in array");
		}else{
			System.out.println(x+"it is present in position of"+num);
		}
	}
}
