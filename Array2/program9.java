// KADANES Alg sub Array to find the max sum


import java.io.*;
class SAkadanesAlo{


		void kadanes(int arr[]){
			
			int currsum=0;
			int maxsum=arr[0];


			for(int i=0;i<arr.length;i++){
				currsum=currsum+arr[i];
				if(currsum<0){
					currsum=0;
				}if(maxsum<currsum){
					maxsum=currsum;
				}
			}
			System.out.println(maxsum);
		}


	public static void main(String[] args)throws IOException{

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	
				System.out.println("Enter the size:");
				int size=Integer.parseInt(br.readLine());
					
				int arr[] =new int[size];	
				System.out.println("Enter the element of the array");

				for(int i=0;i<arr.length;i++){
					arr[i]=Integer.parseInt(br.readLine());
				}

				SAkadanesAlo obj=new SAkadanesAlo();
				obj.kadanes(arr);
	}
}
