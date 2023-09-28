// Check if array is sorted
import java.io.*;
import java.util.*;
class Sortedarr{

        int sorted(int arr[]){

		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				return 0;
			}
		}
		return 1;

            }
        public static void main(String[] args) throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


                        System.out.println("Enter the Array Size:");
                        int size=Integer.parseInt(br.readLine());
                        int arr[]=new int [size];
                        System.out.println("Enter the element in array:");
                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }

                

                Sortedarr obj=new Sortedarr();
               int num= obj.sorted(arr);
	       System.out.println(num);

        }
}


