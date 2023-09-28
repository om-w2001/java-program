// find the smallest and second smalesr element in an array

import java.util.*;
import java.io.*;
class Smallest{
	int  smallest(int arr[]){
		int min=arr[0];
		int z=0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
				z=i;
			}
		}
		return z;
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
		Smallest obj=new Smallest();
		int num=obj.smallest(arr);
								
		System.out.println("smallest element :"+arr[num]);
		System.out.println("second smallest element :"+arr[num+1]);
	}
}

