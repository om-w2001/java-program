/* Write a Java program to find the sum of even and odd numbers in an array.
Display the sum value.
Input: 11 12 13 14 15
Output
Odd numbers sum = 39
Even numbers sum = 26
*/


import java.io.*;
class ArraryDemo{
        static void xyz(int arr[]){
                int sum=0;
		int sum2=0;
                for(int i=0;i<arr.length;i++){
                        if(arr[i]%2==0){
                                sum=sum+arr[i];
                        }else{
				sum2=sum2+arr[i];
			}
                }
		System.out.println("sum of Even Elements:"+sum);
		System.out.println("sum of odd Elements:"+sum2);

               
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

