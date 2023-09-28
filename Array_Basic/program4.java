// product of array element 


import java.io.*;
class Product{

	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size");
		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];

		int start=Integer.parseInt(br.readLine());
		int end=Integer.parseInt(br.readLine());
			
		 arr[0]=start++;
		for(int i=1;i<arr.length;i++){
			if(start<=end){
			arr[i]=start;
			start++;
		}
		}

		int pro=1;

		for(int i=0;i<arr.length;i++){
			pro=pro*arr[i];
			 
		}
		System.out.println(pro);
	}
	
}

