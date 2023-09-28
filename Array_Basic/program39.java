// Leaders in an array

import java.io.*;
class Leaders{

        void leaders(int arr[]){
                
		
		for(int i=0;i<arr.length;i++){
			int j;
		for( j=i+1;j<arr.length;j++){
			if(arr[i]<=arr[j]){
				break;
			}
		}
		if(j==arr.length){
		System.out.print(arr[i]+" ");
		}
		}
			



        }
         public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the size");
                int size=Integer.parseInt(br.readLine());

                int arr[]=new int[size];


                System.out.println("Enter the Array1:");
                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }

                Leaders obj=new Leaders();
                obj.leaders(arr);
         }
}


