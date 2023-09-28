/* Write a Java program to merge two given arrays.
Array1 = [10, 20, 30, 40, 50]
Array2 = [9, 18, 27, 36, 45]
Output :
Merged Array = [10, 20, 30, 40, 50, 9, 18, 27, 36, 45]
Hint: you can take 3rd array
*/


import java.io.*;
class ArraryDemo{
        static void xyz(int arr[],int arr2[],int arr3[],int size){
			int x=0;
                for(int i=0;i<arr3.length;i++){
			if(x==size){
				x=0;
			}
		       	if(x<size&&i<size){
			arr3[i]=arr[x];
			}
		       	else{
				arr3[i]=arr2[x];
			}
			x++;
                }
		for(int i=0;i<arr3.length;i++){
                  System.out.println(arr3[i]);
         }

		      
        }
        public static void main(String[] args)throws IOException{
                System.out.print("Enter the size:");
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          int size=Integer.parseInt(br.readLine());
          int arr[]=new int[size];
                 System.out.print("Enter the array element:");
         for(int i=0;i<arr.length;i++){
                  arr[i]=Integer.parseInt(br.readLine());
         }
	 int arr2[]=new int[size];
                 System.out.print("Enter the array element:");
         for(int i=0;i<arr.length;i++){
                  arr2[i]=Integer.parseInt(br.readLine());
         }
	 int arr3[]=new int [size+size];



         xyz(arr,arr2,arr3,size);
         
        }
}

