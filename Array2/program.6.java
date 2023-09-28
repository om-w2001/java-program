// print subArrays


import java.io.*;

class Subarrays{

	void subarrays(int arr[]){
		
		for(int i=0;i<arr.length;i++){
			int start=i;
			for(int j=i;j<arr.length;j++){
				int end=j;
				for(int k=start;k<=end;k++){
				System.out.print(arr[k]+" ");
			}
			System.out.println();
			}
			System.out.println();
		}
	}

	
public static void main(String[] args)throws  IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
	System.out.println("Enter the size:");
	int size=Integer.parseInt(br.readLine());

	int arr[]=new int[size];

	System.out.println("Enter the element of arrays:");

	   for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
	
	Subarrays obj=new Subarrays();

	System.out.println("Subarrays is given belows:");
	obj.subarrays(arr);
}

}
