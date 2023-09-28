// count pair sum


import java.util.*;
import java.io.*;
class Countpairsum{
        	int pairsum(int arr[],int arr2[],int sum){
			int count=0;
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr2.length;j++){
					if(arr[i]+arr2[j]==sum){
						count++;
					}
				}
			}
			return count;
                
        }
        public static void main(String[] args) throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


                        System.out.println("Enter the Array Size:");
                        int size=Integer.parseInt(br.readLine());
			
			System.out.println("Enter the array two size:");
			int size2=Integer.parseInt(br.readLine());

                        int arr[]=new int [size];
                        System.out.println("Enter the element in array:");
                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
                       System.out.println("Enter the second array:");
			int arr2[]=new int [size2];
			for(int i=0;i<arr2.length;i++){
				arr2[i]=Integer.parseInt(br.readLine());
			}
			System.out.println("Enter the sum:");
			int sum=Integer.parseInt(br.readLine());
			
                Countpairsum obj=new Countpairsum();
                int num=obj.pairsum(arr,arr2,sum);

                System.out.println(num);
        }
}

