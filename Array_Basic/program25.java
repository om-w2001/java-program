// Maximum product of two number


import java.util.*;
import java.io.*;
class Promaxtwo{
        int  pro(int arr[]){
                int max=arr[0];
		int z=0;
		int i=1;
                for(i=1;i<arr.length;i++){
                        if(arr[i]>max){
                                max=arr[i];
                                z=i;
                        }
                }
                return arr[z]*arr[z-1];
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
                Promaxtwo obj=new Promaxtwo();
                int num=obj.pro(arr);

                System.out.println("smallest element :"+num);
        }
}

