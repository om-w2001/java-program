/* WAP to print the elements whose addition of digits is even.
Ex. 26 = 2 + 6 = 8 (8 is even so print 26)
Input :
Enter array : 1 2 3 5 15 16 14 28 17 29 123
Output: 2 15 28 17 123
*/


import java.io.*;
class ArraryDemo{
        static void xyz(int arr[]){

		int sum=0;
                for(int i=0;i<arr.length;i++){
			int x=arr[i];
			while(x!=0){
				sum=sum+x%10;
				x=x/10;
			}
			if(sum%2==0){
				System.out.println(arr[i]);
			}
			sum=0;
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

