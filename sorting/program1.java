// Bubble sort code

import java.io.*;
class SortingBubble{


	void Bubble(int arr[]){
			
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
		System.out.println("Enter the size :");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter the array element:");

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		
		}
		SortingBubble obj=new SortingBubble();

		obj.Bubble(arr);
			
		System.out.println("Sorted array");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}

	}
}
