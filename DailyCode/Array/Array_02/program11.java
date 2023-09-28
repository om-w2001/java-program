 /* WAP to take size of array from user and also take integer elements from user
find the minimum element from the array
input : Enter size : 5
Enter array elements: 1 2 5 0 4
output: min element = 0
*/


import java.io.*;
class ArraryDemo{
        static int xyz(int arr[]){
                int max=arr[0];
                for(int i=1;i<arr.length;i++){
                        if(max<arr[i]){
                                max=arr[i];
                        }
                        }

                  return max;
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


        int max= xyz(arr);
        System.out.println("max element"+max);

        }
}


