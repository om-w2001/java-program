// missing number in array


import java.io.*;
import java.util.*;
class missing{
	void Missing(int arr[],int x){

		int add=0;
		int add2=0;
		for(int i=0;i<arr.length;i++){
			add=add+arr[i];
		}
		for(int i=1;i<=x;i++){
			add2=add2+i;
	}
	System.out.println(add2-add);

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
		System.out.println("Enter the number:");
		int x=Integer.parseInt(br.readLine());
			
		Arrays.sort(arr);
			
		missing obj=new missing();
		obj.Missing(arr,x);
	}
}

		
