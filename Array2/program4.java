// Reverse an array


import java.io.*;

class Reverse{

	void reverse(int arr[]){

		int start=0;
		int end=arr.length-1;


		while(start<=end){

			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;

			start++;
			end--;	

		}
	}
	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of the array:");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int [size];
		
		System.out.println("Enter the element of the array:");

		for(int i=0;i<arr.length;i++){
			
			arr[i]=Integer.parseInt(br.readLine());
		}
			
		Reverse obj=new Reverse();
		obj.reverse(arr);

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}

