/* Count the number of elements between two given elements
in an array. Given an unsorted array and two elements num1
and num2.*/

import java.io.*;
import java.util.*;
class Countele{
        int  countele(int arr[],int num1,int num2){
               
		int k=-1;
		int h=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num1){
				k=i;
			}if(arr[i]==num2){
				h=i;
			}
		}
		System.out.println(k);
		System.out.println(h);
		return (h-k)-1;
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
                
              //  Arrays.sort(arr);
		System.out.println("Enter the num2:");
		int num1=Integer.parseInt(br.readLine());

		System.out.println("Enter the num2:");
		int num2=Integer.parseInt(br.readLine());
			
		Countele obj=new Countele();
                int num=obj.countele(arr,num1,num2);

                System.out.println("Count element  time :"+num);
        }
}

