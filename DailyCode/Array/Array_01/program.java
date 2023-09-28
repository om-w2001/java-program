/* WAp to take size of array from user and also take integer element from user print sum of odd element only 
  input:Enter size:5
        Enter elements:1 2 3 4 5


output:9

*/
import java.io.*;
class ArraryDemo{
	static int xyz(int arr[],int size){
		int sum=0;
		for(int i=0;i<size;i++){
			if(arr[i]%2!=0){
				sum=sum+arr[i];
			}
		}
		return sum;
	}
	public static void main(String[] args)throws IOException{
		System.out.print("Enter the size:");
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int size=Integer.parseInt(br.readLine());
	  int arr[]=new int[size];
		 System.out.print("Enter the array element:");
	 for(int i=0;i<size;i++){
		  arr[i]=Integer.parseInt(br.readLine());
	 }
	 

	 int sum=xyz(arr,size);
	 System.out.println("array odd element sum ="+sum);
	}
}

