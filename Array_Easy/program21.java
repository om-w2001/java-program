// Non Repeating element

import java.io.*;
import java.util.*;
class Nonrepeating{

        void  non(int arr[]){
				
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					 count++;
				}
			}
			if(count==1){
				System.out.println(arr[i]);
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

                Nonrepeating obj=new Nonrepeating();
               obj.non(arr);



        }
}

