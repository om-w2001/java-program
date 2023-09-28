// Form largest number from digits

import java.util.Arrays;
import java.io.*;
class Largestnum{
		
	public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the size");
                int size=Integer.parseInt(br.readLine());

                int arr[]=new int[size];

                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
			

		Arrays.sort(arr);

		int res=0;
		for(int i=arr.length-1;i>=0;i--){
			res=res*10+arr[i];
		}
		System.out.println(res);
	}
}

