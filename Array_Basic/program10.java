// Max Odd Sum 


class Maxoddsum{
			

	void maxSum(int arr[]){
		int max=arr[0];
		int currmax=0;

		for(int i=0;i<arr.length;i++){
			int start=i;
			for(int j=i;i<arr.length;j++){
				int end=j;
				currmax=0;
				for(int k=start;k<=end;k++){
					currmax=currmax+arr[k];
				}
				if(max<currmax){
					max=currmax;
				}
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

