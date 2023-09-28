/*Write a program to print the second min element in the array
Input: Enter array elements: 255 2 1554 15 65 95 89
Output: 15
*/

import java.io.*;
class ArraryDemo{
        static int xyz(int arr[]){
		int temp=0;
                for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				
			if(arr[i]>arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		}
		

                  return arr[1];
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


        int temp= xyz(arr);
	System.out.println(temp);



        }
}

