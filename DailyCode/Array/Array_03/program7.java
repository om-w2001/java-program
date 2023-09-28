/* WAP to find a Strong number from an array and return its index.
Take size and elements from the user
Input: 10 25 252 36 564 145
Output: Strong no 145 found at index: 5
*/


import java.io.*;
class ArraryDemo{
        static void xyz(int arr[]){
		
                for(int i=0;i<arr.length;i++){
			int n=arr[i];
			int sum=0;
			while(n!=0){
				int z=n%10;
				int mult=1;
				for(int j=1;j<=z;j++){
					mult=mult*j;
				}
				sum=sum+mult;
				n=n/10;
			}
			System.out.println(sum);
			if(sum==arr[i]){
				System.out.println("Output: Strong no "+ arr[i]+" found at index:"+i);
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

