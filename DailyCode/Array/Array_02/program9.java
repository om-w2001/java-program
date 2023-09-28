/* WAP to search a specific element from an array and return its index.
Input: 1 2 4 5 6
Enter element to search: 4
Output: element found at index: 2*/


import java.io.*;
class ArraryDemo{
        static int xyz(int arr[],int x){
                int count=0;
		int count2=0;
                for(int i=0;i<arr.length;i++){
                        if(arr[i]==x){
                                return i;
                        }
                }
		return -1;

               
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
		 System.out.print("Enter to search:");
		int x=Integer.parseInt(br.readLine());

        int z= xyz(arr,x);

	 if(z==-1){
		 System.out.println("element is not found");
	 }else{
		 System.out.println("element found at index"+z);
	 }
         
        }
}

