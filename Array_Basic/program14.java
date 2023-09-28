// Maximum repeating number

import java.io.*;
class Maxrep{

		void max(int arr[] ,int k){
			        int arr2[]=new int[63];

                for(int i=0;i<arr2.length;i++){
                        arr2[i]=-1;
                }
                int i=0;
                int count=0;
                for(int j=0;j<arr.length;j++){
                        if(arr[j]==arr[i]){
                                count++;
                        }else if(j==arr.length-1){
                                i++;
                                j=0;count=0;
                        }
                        arr2[arr[i]]=count;
                }
			int max=arr2[arr[0]];
		for(int z=0;z<arr2.length;z++){
		/*	if(max<arr2[z]){
				max=arr2[z];
			}*/
			System.out.println(arr2[z]);
		}
		System.out.println(max);
		}
		
	 public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the size");
                int size=Integer.parseInt(br.readLine());

                int arr[]=new int[size];

                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }

                System.out.println("Enter the K value:");
                int k=Integer.parseInt(br.readLine());
			
		Maxrep obj=new Maxrep();
		obj.max(arr,k);
	 }
}


