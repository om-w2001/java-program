/* WAP to take size of array from user and also take integer elements from user
find the minimum element from the array
input : Enter size : 5
Enter array elements: 1 2 5 0 4
output: min element = 0
*/


import java.io.*;
class ArraryDemo{
        static int xyz(int arr[]){
                int min=arr[0];
                for(int i=1;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
			}

                  return min;      
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


        int min= xyz(arr);	
	System.out.println("min element"+min);
         
        }
}

