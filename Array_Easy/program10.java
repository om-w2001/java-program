// First Repeating Element

import java.io.*;
import java.util.*;
class FirstRepeating{

        int repeating(int arr[]){
				
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				
				}
			}
			if(count!=0){
				return i;
			}
		}
		return -1;

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

                
                FirstRepeating obj=new FirstRepeating();
               int num= obj.repeating(arr);

	       System.out.println(num);

        }
}


