// Exceptionally odd



import java.io.*;
class Exceptionally{
	int  exceptionallyodd(int arr[]){
		
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count%2!=0){
				return arr[i];
			}
		}
		return -1;
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

		Exceptionally obj=new Exceptionally();
		int num=obj.exceptionallyodd(arr);

		System.out.println("Exceptionally odd:"+num);
	}
}

