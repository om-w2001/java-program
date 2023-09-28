/* WAp take 10 input from the user and print only elment that are divisible by 5
input: 10  2 2 3 3 3 4 4 25 55 
*/


import java.io.*;
class ArraryDemo{
        static void xyz(int arr[]){
                
                for(int i=0;i<arr.length;i++){
                        if(arr[i]%5==0){
                                System.out.println(arr[i]);
                        }
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

