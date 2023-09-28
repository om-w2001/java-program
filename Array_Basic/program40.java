// Fibonacci in the array
import java.io.*;
class Fibonacci{

        void fibonacci(int arr[],int arr2[]){
			
		int count=0;
		for(int j=0;j<arr.length;j++){
		for(int i=0;i<arr2.length;i++){
			if(arr[j]==arr2[i]){
				count++;
				break;
			}
		}
		}

		System.out.println(count);
                
        }
         public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the size");
                int size=Integer.parseInt(br.readLine());

                int arr[]=new int[size];
		int arr2[]={ 0,1,1,2,3,5,8,13,21,34,55};

                System.out.println("Enter the Array1:");
                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }

               Fibonacci obj=new Fibonacci();
                obj.fibonacci(arr,arr2);
         }
}


