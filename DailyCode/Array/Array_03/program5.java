/* WAP to find a Perfect number from an array and return its index.
Take size and elements from the user
Input: 10 25 252 496 564
Output: Perfect no 496 found at index: 3
*/


import java.io.*;
class ArraryDemo{
        static void xyz(int arr[]){
                for(int i=0;i<arr.length;i++){
			int n=arr[i];
			int sum=0;
			for(int j=1;j<n;j++){
				if(n%j==0){
					sum=sum+j;
				}
			}if(sum==arr[i]){
					System.out.println("perfect no "+arr[i]+" found at index "+ i);
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

