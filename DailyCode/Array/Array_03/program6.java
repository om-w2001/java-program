/* WAP to find a palindrome number from an array and return its index.
Take size and elements from the user
Input: 10 25 252 36 564

Output: Palindrome no 252 found at index: 2
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
			if(arr[i]==x){
				System.out.println("palindrome no "+arr[i]+"found at index: "+i);
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

