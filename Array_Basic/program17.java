// Product of maximum in first array and minimum in second

import java.io.*;
class Promaxmin{

	void maxmin(int arr[],int arr2[]){
		int max=arr[0];
		int min=arr2[0];

		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}if(min>arr2[i]){
				min=arr2[i];
			}
		}
		System.out.println(max*min);
	}

	public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the size");
                int size=Integer.parseInt(br.readLine());
			
		System.out.println("Enter the First array:");
                int arr[]=new int[size];
		int arr2[]=new int[size];

                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
		System.out.println("Enter the Second array:");

		for(int i=0;i<arr.length;i++){
                        arr2[i]=Integer.parseInt(br.readLine());
                }
		
		Promaxmin obj=new Promaxmin();
		obj.maxmin(arr,arr2);

	}
}
