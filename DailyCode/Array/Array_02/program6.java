/* Write a program to create an array of ‘n’ integer elements.
Where ‘n’ value should be taken from the user.
Insert the values from users and find the sum of all elements in the array.
Input:
n=6
Enter elements in the array: 2 3 6 9 5 1
Output:26
*/


import java.io.*;
class ArraryDemo{
        static int xyz(int arr[]){
                int sum=0;
                for(int i=0;i<arr.length;i++){
                        sum=sum+arr[i];
               
        }
	return sum;
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


         int sum=xyz(arr);
	 System.out.println("output="+sum);
         
        }
}

