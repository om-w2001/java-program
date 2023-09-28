// Even occurring elements


import java.util.*;
import java.io.*;
class Evenelement{
		
	void even(int arr[]){
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
		/*
		System.out.println(arr2[9]);
		System.out.println(arr2[12]);
		System.out.println(arr2[23]);
		System.out.println(arr2[10]);
		System.out.println(arr2[15]);
		System.out.println(arr2[14]);
		*/
		
	for(int z=0;z<arr2.length;z++){
		System.out.println(z+" "+arr2[z]);
	}	
		
	}
/*	
		void even(int arr[]){
			int i=0;
			int count=0;
			for(int j=0;j<arr.length;j++){
				if(arr[j]==arr[i]){
					count++;
				}else if(j==arr.length-1){
					if(count%2==0){
						System.out.print(arr[i]+" ");
						}
						i++;
						j=0;
						count=0;
					
				}else if(i==arr.length-1){
					break;
				}
			}
		}

*/
		
	public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the size");
                int size=Integer.parseInt(br.readLine());

                int arr[]=new int[size];

                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }

		Evenelement obj=new Evenelement();
			
		//Arrays.sort(arr);
		obj.even(arr);
		
	}
}
