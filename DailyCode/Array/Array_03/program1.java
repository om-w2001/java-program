/* Write a program to print count of digits in elements of array.
Input: Enter array elements : 02 255 2 1554
Output: 2 3 1 4
*/


import java.io.*;
class ArraryDemo{
        static void xyz(int arr[]){
                for(int i=0;i<arr.length;i++){
			int n=arr[i];
			int count=0;
			while(n!=0){
				count++;
				n=n/10;
			}
			System.out.println(count);
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


         xyz(arr);
	 
         
        }
}

