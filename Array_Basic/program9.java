// Remove an element at specific Index from an array

import java.io.*;
class SpecificInd{

	void remove(int arr[],int x){
		
		if(x>arr.length){
			System.out.println("Renter the index:");
		}
		//int arr2[]=int [arr.length];
		for(int i=0;i<arr.length-1;i++){
			if(i>=x){
				arr[i]=arr[i+1];
			}
		}
		arr[arr.length-1]=0;
	
	}
	public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the size");
                int size=Integer.parseInt(br.readLine());

                int arr[]=new int[size];
			
		System.out.println("Enter the element in array:");
                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
		System.out.println("Enter the specific index:");
		int x=Integer.parseInt(br.readLine());
			
		SpecificInd obj=new SpecificInd();
		obj.remove(arr,x);

		for(int i=0;i<arr.length-1;i++){
			System.out.println(arr[i]);
		}
	}
}


