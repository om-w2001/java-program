// Left most and rigth most index


import java.io.*;
import java.util.*;
class Lrindex{

        void  index(int arr[],int X){
				
		int first=-1;
		int end=-1;
			for(int i=0;i<arr.length;i++){
				if(X==arr[i] && first==-1){
					first=i;
					end=i;
				}else if(X==arr[i]){
					end=i;
				}
			}

			System.out.println(first+" "+end);

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
			
		System.out.println("Enter the X element:");

		int X=Integer.parseInt(br.readLine());
               Lrindex obj=new Lrindex();
               obj.index(arr,X);



        }
}

