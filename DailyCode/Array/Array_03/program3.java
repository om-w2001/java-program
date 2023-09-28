/* WAP to find a composite number from an array and return its index.
Take size and elements from the user
Input: 1 2 3 5 6 7
Output: composite 6 found at index: 4
*/


import java.io.*;
class ArraryDemo{
        static void xyz(int arr[]){
                for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=2;j<arr[i];j++){
				if(arr[i]%j==0){
					count++;
				}
			}if(count>1){
					System.out.println("Composite "+arr[i]+" found at index "+ i);
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

