// Minimum product of k Integers

import java.util.*;
import java.io.*;
class Minpro{
        void minpro(int arr[],int k){
                int pro=1;
			for(int i=0;i<k;i++){
				pro=pro*arr[i];
				
			}
			
		System.out.println(pro);
                
        }
         public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the size");
                int size=Integer.parseInt(br.readLine());

                int arr[]=new int[size];
                

                System.out.println("Enter the Array1:");
                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
		
		System.out.println("Enter the k value:");
		int k=Integer.parseInt(br.readLine());
			
		Arrays.sort(arr);
                Minpro obj=new Minpro();
                obj.minpro(arr,k);
         }
}

