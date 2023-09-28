// pair in array
//

import java.io.*;

class Pairarr{


	void pair(int arr[]){

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				System.out.print("("+arr[i]+" "+arr[j]+")");
			}
		}
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array:");

		int size=Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];
		System.out.println("Enter the element of array:");

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		Pairarr obj=new Pairarr();

		obj.pair(arr);
	}
}
