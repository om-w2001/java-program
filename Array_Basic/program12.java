// First and last occurrences of X 


import java.io.*;
class FLocc{
		

	void FirstLast(int arr[] ,int x){
		int first=-1;
		int last=-1;


		for(int i=0;i<arr.length;i++){
			if(arr[i]!=x){
				
			}else if(first==-1){
				first=i;
			}else{
				last=i;
			}
		}

		if(first==-1){
			System.out.println(x+" is not present in the array");
		}else{
			System.out.println(first+" "+last);
		}

	}

 public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the size");
                int size=Integer.parseInt(br.readLine());

                int arr[]=new int[size];

                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
     
                System.out.println("Enter the X value:");
                int X=Integer.parseInt(br.readLine());
		
		FLocc obj=new FLocc();
		obj.FirstLast(arr,X);
 }
}
                      
