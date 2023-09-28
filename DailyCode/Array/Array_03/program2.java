/* WAP to reverse each element in an array.
Take size and elements from the user
Input: 10 25 252 36 564
Output: 01 52 252 63 465
*/


import java.io.*;
class ArraryDemo{
        static void xyz(int arr[]){
                for(int i=0;i<arr.length;i++){
			int n=arr[i];
			int x=0;
			int z;
			while(n!=0){
				z=n%10;
				x=(x*10)+z;
				n=n/10;
			}
			arr[i]=x;
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
	 
         for(int i=0;i<arr.length;i++){
                  System.out.print(arr[i]+" ");
         }

        }
}

