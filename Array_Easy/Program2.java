// sort an array of 0 ,1,2


import java.io.*;
import java.util.*;
class Arrsort{

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

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
}
}
