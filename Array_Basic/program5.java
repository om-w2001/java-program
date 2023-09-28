// Replace all 0's with 5


import java.io.*;
class ReplaceZero{
		
		/*
		String str=INterger.toString(n);
		String str2=str.replace('0','5');
		int z=Integer.parseInt(Str2);
		return z;
		*/
	void replace(int arr[] ){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				arr[i]=5;
			}
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

		ReplaceZero obj=new ReplaceZero();

		obj.replace(arr);

		for(int i=0;i<arr.length;i++){
	                      
			System.out.print(arr[i]);
                }



	}
}

