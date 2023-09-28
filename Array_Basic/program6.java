// Element in the Range

import java.io.*;
class Range{
		
	boolean range(int arr[] ,int A ,int B){
			
		int x=A;
		for(int i=0;i<arr.length;i++){
			if(x==arr[i]){
				i=-1;
				x++;
			}else if(x>B){
				return true;
			}
		
		}
		return false;
	}

	public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the size");
                int size=Integer.parseInt(br.readLine());

                int arr[]=new int[size];

                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
			
		System.out.println("Enter the A value:");
		int A=Integer.parseInt(br.readLine());
			
		 System.out.println("Enter the B value:");
                int B=Integer.parseInt(br.readLine());

                Range obj=new Range();

               boolean x= obj.range(arr, A ,B);
	       System.out.println(x);
	}
}

