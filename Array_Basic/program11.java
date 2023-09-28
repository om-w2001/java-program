// Product of maximum in first array and minimum in second

import java.io.*;
class Maxmin{
	

	void minmax(int arr[],int arr2[]){
		int max=arr[0];
		int min=arr2[0];

		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			} if(min>arr2[i]){
				min=arr2[i];
			}
		}

		System.out.println("The max element among these element is :"+max);
		System.out.println("The min element among these element is:"+min);
		System.out.println(min*max);
	}


	 public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the size");
                int size=Integer.parseInt(br.readLine());

                int arr[]=new int[size];
		int arr2[]=new int[size];
	
		System.out.println("Enter the Array1:");
                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }

		System.out.println("Enter the Array2:");
                for(int i=0;i<arr.length;i++){
                        arr2[i]=Integer.parseInt(br.readLine());
                }
		
		Maxmin obj=new Maxmin();
		obj.minmax(arr,arr2);
	 }
}
