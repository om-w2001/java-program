/* WAP to find the number of even and odd integers in a given array of integers
Input: 1 2 5 4 6 7 8
Output:
Number of Even Elements: 4
Number of Odd Elements : 3
*/


import java.io.*;
class ArraryDemo{
        static void xyz(int arr[]){
                int count=0;
		int count2=0;
                for(int i=0;i<arr.length;i++){
                        if(arr[i]%2==0){
                                count++;
                        }else{
				count2++;
			}
                }
		System.out.println("Number of Even Elements:"+count);
		System.out.println("Number of odd Elements:"+count2);

               
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

