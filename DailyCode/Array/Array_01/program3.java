/* WAp to take size of array from user and also take integer element from user print product of odd index only
        input:enter the size:6
              Enter the array element:1 2 3 4 5 6

output:40
*/



import java.io.*;
class ArraryDemo{
        static int xyz(int arr[]){
                int mult=1;
                for(int i=0;i<arr.length;i++){
                        if(i%2!=0){
                                mult=mult*arr[i];
                        }
                }
                return mult;
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


         int mult=xyz(arr);
         System.out.println("array even  element product ="+mult);
        }
}


