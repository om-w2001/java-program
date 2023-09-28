/* Smallest value in array */
import java.io.*;
class smallest{

	int small(int arr[]){
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size of the array:");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int [size];
		System.out.println("Enter the element of array:");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		smallest obj=new smallest();
		int num=obj.small(arr);
		System.out.println(num);
	}
}	
