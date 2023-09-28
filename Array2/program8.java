// Max-subarray sum -II( PRIFIX SUM )



import java.io.*;
class maxsubAII{
	void maxSubarray(int arr[]){
				
		int max=arr[0];
			int curremax=0;
		int prifix []=new int [arr.length];
		prifix[0]= arr[0];
	
		for(int i=1;i<arr.length;i++){
			prifix[i]=prifix[i-1]+arr[i];
		}

		for(int i=0;i<arr.length;i++){
			int start=i;
			for(int j=i;j<arr.length;j++){
				int end =j;
				if(start==0){
					curremax=prifix[end];
				}else{
					curremax=prifix[end]-prifix[start-1];
				}
			
				if(max<curremax){
					max=curremax;
				}
			}
		}

		System.out.println("max sum of the subarray is :"+max);
	}

	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int size=Integer.parseInt(br.readLine());

		int arr[] =new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		maxsubAII obj=new maxsubAII();
		obj.maxSubarray(arr);
	}
}
