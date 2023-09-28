// Rotate Array



import java.io.*;
import java.util.*;
class Rotatearr{

        void rotate(int arr[],int D){

		int arr2[]=new int[arr.length];
			
		int j=0;
		for(int i=D;i<arr.length;i++){
			arr2[j]=arr[i];
			j++;
		}

		for(int i=0;i<D;i++){
			arr2[j]=arr[i];
			j++;
		}
			
		System.out.println("output:");

		for(int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}
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
			
		System.out.println("Enter the D :");

		int D=Integer.parseInt(br.readLine());

                
                Rotatearr obj=new Rotatearr();
                obj.rotate(arr,D);

        }
}


