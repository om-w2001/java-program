import java.io.*;
class Subarrmaxsum{
	void maxsum(int arr[], int x){
		int currmax=0;
		for(int i=0;i<arr.length;i++){
			int start=i;
			for(int j=i;j<arr.length;j++){
				int end=j;
				currmax=0;
				for(int k=start;k<=end;k++){
					currmax=currmax+arr[k];
				}
				if(currmax==x){
					System.out.println(i+" "+j);
				}
				
			}
		}	
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Size:");

		int size=Integer.parseInt(br.readLine());

		System.out.println("Enter the element in arrary:");

		int arr[]=new int[size];

		for(int i=0;i<arr.length;i++){

			arr[i]=Integer.parseInt(br.readLine());
		}
				System.out.println("Enter the x:");
			 int x=Integer.parseInt(br.readLine());

			Subarrmaxsum obj=new Subarrmaxsum();
		obj.maxsum(arr, x);
	}
}
