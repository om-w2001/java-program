// Find the closest number

import java.util.*;
import java.io.*;
class Closestnum{

	void closenum(int arr[], int k){

		int min=arr[0]-k;
		for(int i=1;i<arr.length;i++){
			if(min<Math.abs(arr[i]-k)){
				min=Math.abs(arr[i]-k);
			}
		}
		System.out.println(min);

	}

	public static void main(String[] args) throws IOException{


		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Size:");

		int size=Integer.parseInt(br.readLine());

		System.out.println("Enter the element in arrary:");

		int arr[]=new int[size];

		for(int i=0;i<arr.length;i++){

			arr[i]=Integer.parseInt(br.readLine());
		}
				System.out.println("Enter the x:");
			 int x=Integer.parseInt(br.readLine());

			Closestnum obj=new Closestnum();
		obj.closenum(arr, x);
	}
}
