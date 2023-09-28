// number of occurance

import java.io.*;
import java.util.*;
class Occnum{

        void occnum(int arr[],int n){
			
			int count=0;
			for(int j=0;j<arr.length;j++){
				if(n==arr[j]){
					count++;
				}
			}
			System.out.println(n+" occuting "+count+" times");
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

                System.out.println("Enter the number:");
		int n=Integer.parseInt(br.readLine());
                Occnum obj=new Occnum();
                obj.occnum(arr,n);

        }
}



