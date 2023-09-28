// ceil the floor



import java.util.*;
import java.io.*;
class CeillFloor{
       void  ceilfloor(int arr[],int x){
                int ceil=-1;
		int floor=-1;
                
                for(int i=0;i<arr.length;i++){
                        if(arr[i]<x){
                                ceil=arr[i];
                        }else if(arr[i]>x){
				floor=arr[i];
				break;
			}
                }

		System.out.println(ceil);
		System.out.println(floor);
                
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
			System.out.println("Enter the x Number:");
			int x=Integer.parseInt(br.readLine());
                        Arrays.sort(arr);
                CeillFloor obj=new CeillFloor();
                obj.ceilfloor(arr,x);

  
        }
}

