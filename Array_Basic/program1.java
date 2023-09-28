// Search an element in an array

import java.io.*;
class Search{
	int find(int arr[],int x){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==x){
				return i;
			}
		}
		System.out.println("Element is not found");
		return -1;
	}
	public static void main(String args[])throws IOException{
		int index;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array");
		int size=Integer.parseInt(br.readLine());

		System.out.println("Enter the element in array:");

		int arr[]=new int[size];

		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Enter the element to find:");
		int x=Integer.parseInt(br.readLine());
			Search obj=new Search();
		int y=obj.find(arr,x);

		System.out.println("index=="+y);
	}
}



		

