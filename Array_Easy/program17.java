// Find all pairs with given sum



import java.io.*;
import java.util.*;
class Pairs_sum{

        void sum(int arr[],int arr2[],int X){

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr[i]+arr2[j]==X){
					System.out.println(arr[i]+" "+arr2[j]);
				}
			}
		}

            }
        public static void main(String[] args) throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


                        System.out.println("Enter the Array Size:");
                        int size=Integer.parseInt(br.readLine());
                        int arr[]=new int [size];
                        System.out.println("Enter the element in array:");
                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
	                System.out.println("Enter the Array 2 Size:");
                        int size2=Integer.parseInt(br.readLine());
                        int arr2[]=new int [size2];
                        System.out.println("Enter the element in array:");
                for(int i=0;i<arr2.length;i++){
                        arr2[i]=Integer.parseInt(br.readLine());
                }
			
		System.out.println("Enter the X value:");

		int X=Integer.parseInt(br.readLine());
			
                Pairs_sum obj=new Pairs_sum();
                obj.sum(arr,arr2,X);
	}
}

