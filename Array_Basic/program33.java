// Multiply left and right array sum


import java.io.*;
import java.util.*;
class Multleftright{
        int  leftright(int arr[]){
				int i=0;
				int j=arr.length-1;
				int sum1=0;
				int sum2=0;

				while(i<j){
					sum1=sum1+arr[i];
					sum2=sum2+arr[j];
					j--;
					i++;
				}
				return sum1*sum2;



                
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
                
                Multleftright obj=new Multleftright();
                
                int num=obj.leftright(arr);

                System.out.println("First element to occur k time :"+num);
        }
}

