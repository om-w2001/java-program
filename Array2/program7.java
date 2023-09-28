// maxSum in subarray -I( BRUTE FORCE)

import java.io.*;
class maxsum{

	void maxsum(int arr[]){
		int max=arr[0];
		int currmax=0;

		for(int i=0;i<arr.length;i++){
			int start=i;
			for(int j=i;j<arr.length;j++){
				int end=j;
				currmax=0;
				for(int k=start;k<=end;k++){
					currmax=currmax+arr[k];
				}
				System.out.println("sum of subarray is "+ currmax);
				if(max<currmax){
					max=currmax;
				}
				
			}
		}
		System.out.println(max);
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
	

			maxsum obj=new maxsum();
		obj.maxsum(arr);
	}
}
