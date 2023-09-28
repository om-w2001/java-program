// FInd a peak element which is not smaller than its neighbors

import java.io.*;
class peaksmall{

        void peaksmall(int arr[]){
		int n=arr.length;	
		if(n==1){
			System.out.println(arr[0]);
		
		}
		if(arr[0]>=arr[1]){
			 System.out.println(arr[0]);
		}if(arr[n-1]>=arr[n-2]){
			System.out.println(arr[n-1]);
		}
		for(int i=1;i<arr.length-1;i++){
			if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
				System.out.println(arr[i]);
			}
		}
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

                peaksmall obj=new peaksmall();
                obj.peaksmall(arr);
         }
}

