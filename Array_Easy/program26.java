// Leader in an array


import java.io.*;
class Leaderarr{

        void  leaderarr(int arr[]){

		for(int i=0;i<arr.length-1;i++){
			int j=0;
			for( j=i+1;j<arr.length;j++){
			if(arr[i]>=arr[j]){
				
			}else{
				break;
			}
		}
		if(j==arr.length){
		System.out.println(arr[i]);
		}
		}
             
			System.out.println(arr[arr.length-1]);

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

                Leaderarr obj=new Leaderarr();
               obj.leaderarr(arr);


        }
}

