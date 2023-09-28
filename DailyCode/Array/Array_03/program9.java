/*Write a program to print the second max element in the array
Input: Enter array elements: 2 255 2 1554 15 65
Output: 255
*/

import java.io.*;
class ArraryDemo{
        static int xyz(int arr[]){
		int max=arr[0];
		int temp=0;
                for(int i=1;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

                  return arr[2];      
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

