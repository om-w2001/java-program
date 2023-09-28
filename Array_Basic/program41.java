// Countries at war

import java.io.*;
class Countries{
        char war(int arr[], int arr2[]){
			
		int A=0;
		int B=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]>arr2[i]){
				A++;
			}if(arr[i]<arr2[i]){
				B++;
			}
		}

                if(A<B){
			return 'B';
		}if(A>B){
			return 'A';
		}

		return 0;
        }
        public static void main(String[] args) throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("Enter the Size:");

                int size=Integer.parseInt(br.readLine());

                System.out.println("Enter the element in arrary:");

                int arr[]=new int[size];

                for(int i=0;i<arr.length;i++){

                        arr[i]=Integer.parseInt(br.readLine());
                }
                   System.out.println("Enter the element in arrary two:");
		   int arr2[]=new int [size];

		   for(int i=0;i<arr2.length;i++){
			   arr2[i]=Integer.parseInt(br.readLine());
		   }

                        Countries obj=new Countries();
                char num=obj.war(arr, arr2);

		System.out.println(num);
        }
}
        
