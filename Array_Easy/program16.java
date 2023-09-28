// Rotation



import java.io.*;
import java.util.*;
class Rotation{

        int  rotation(int arr[]){

		int arr2[]=new int[arr.length];

                for(int i=0;i<arr.length;i++){
			arr2[i]=arr[i];
		}
		Arrays.sort(arr2);
			
	
		for(int i=0;i<arr.length;i++){
			if(arr2[0]==arr[i]){
				return i;
			}
		}

		return 0;
		
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

                Rotation obj=new Rotation();
               int num= obj.rotation(arr);


	       System.out.println(num);

        }
}


