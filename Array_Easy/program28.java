// product array puzzle


import java.io.*;
class Puzzle{

        void puzzle(int arr[]){

		for(int i=0;i<arr.length;i++){
			int pro=1;
			for(int j=0;j<arr.length;j++){
				if(i!=j){
					pro=pro*arr[j];
				}
			}
			System.out.println(pro);
			
		}
			


               

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

                Puzzle obj=new Puzzle();
               obj.puzzle(arr);


        }
}

