/* WAP to find the common elements between two arrays.
Input :
Enter first array : 1 2 3 5
Enter Second array: 2 1 9 8
Output: Common elements :
1
2
*/


import java.io.*;
class ArraryDemo{
        static void xyz(int arr[],int arr2[]){
              System.out.println("Common element");
                for(int i=0;i<arr.length;i++){
                        if(arr[i]==arr2[i]){
                                System.out.println(arr[i]);
                        }
                        }
        }
        public static void main(String[] args)throws IOException{
                System.out.print("Enter the size:");
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          int size=Integer.parseInt(br.readLine());
          int arr[]=new int[size];
	  int arr2[]=new int[size];
                 System.out.print("Enter the array element:");
         for(int i=0;i<arr.length;i++){
                  arr[i]=Integer.parseInt(br.readLine());
         }
	 System.out.print("Enter the second array");
	 for(int i=0;i<arr.length;i++){
                  arr2[i]=Integer.parseInt(br.readLine());
         }


        xyz(arr,arr2);
  
        }
}


