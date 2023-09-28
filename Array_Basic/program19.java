// Find common element in three Sorted arrays

import java.io.*;
class Common{
	

		void common(int arr[] ,int arr2[] ,int arr3[]){

			int i=0,j=0,k=0;

			while(i<arr.length && j<arr2.length && k<arr3.length){
				if(arr[i]==arr2[j] && arr2[j]== arr3[k]){
					System.out.println(arr[i]+" ");
					i++;
					j++;
					k++;
				}
				else if(arr[i]<arr[j]){
					i++;
				}else if(arr2[j]<arr3[k]){
					j++;
				}else{
					k++;
				}
			}
		}	
			 
				
	 public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the size");
                int size=Integer.parseInt(br.readLine());

		System.out.println("Enter the size");
                int size2=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the size");
                int size3=Integer.parseInt(br.readLine());


                int arr[]=new int[size];
		int arr2[]=new int [size2];
		int arr3[]=new int [size3];
			
		System.out.println("Enter the arr");
                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
		System.out.println("Enter the arr2:");
		for(int i=0;i<arr2.length;i++){
                        arr2[i]=Integer.parseInt(br.readLine());
                }

		System.out.println("Enter arr3:");
		for(int i=0;i<arr3.length;i++){
                        arr3[i]=Integer.parseInt(br.readLine());
                }

		Common obj=new Common();

		obj.common(arr ,arr2 ,arr3);

	 }
}

			
