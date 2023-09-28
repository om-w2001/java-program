// Find minimum and maximum element in an array

import java.io.*;
class Minmax{
		
	void maxmin(int arr[]){
		int max=arr[0];
		int min=arr[0];

		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println(max+" "+min);
	}
	public static void main(String[] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array:");
		int size=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the element of array:");
		int arr[]=new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		Minmax obj=new Minmax();
		obj. maxmin(arr);
	}
}
		
