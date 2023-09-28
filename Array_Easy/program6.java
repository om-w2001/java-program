// Second largest

import java.io.*;
import java.util.*;
class Seclargest{

        void second(int arr[]){
			int max=arr[0];
			int sec=-1;

			for(int i=1;i<arr.length;i++){
				if(max<arr[i]){
					sec=max;
					max=arr[i];
				}
			}

			System.out.println(sec);

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

                Arrays.sort(arr);

                Seclargest obj=new Seclargest();
                obj.second(arr);

        }
}


