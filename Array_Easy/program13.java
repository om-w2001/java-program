// minimum distance between two number


import java.io.*;
import java.util.*;
class Dismin{

        void dismin(int arr[],int x,int y){
		
		for(int i=0;i<arr.length;i++){
			



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

                System.out.println("Enter the x value:");
		int x=Integer.parseInt(br.readLine());

		System.out.println("Enter the y value:");
		int y=Integer.parseInt(br.readLine());

                Dismin obj=new Dismin();
                obj.dismin(arr,x,y);

        }
}


