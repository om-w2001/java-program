/*WAP to find an ArmStong number from an array and return its index.
Take size and elements from the user
Input: 10 25 252 36 153 55 89
Output: Armstrong no 153 found at index: 4
 
 */



import java.io.*;
class ArraryDemo{
        static void xyz(int arr[]){

                for(int i=0;i<arr.length;i++){
                        int n=arr[i];
                        int z;
			int sum=0;
                        while(n!=0){
                                 z=n%10;
                                n=n/10;
				sum=sum+(z*z*z);
                        }
                        
                        if(sum==arr[i]){
                                System.out.println("Output: Armstrong no "+ arr[i]+" found at index:"+i);
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

