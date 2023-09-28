// Alernate  positive and negative number
import java.io.*;
class Alernatepos{

        void Alter(int arr[]){
			int arr2[]=new int[arr.length];
					
				int z=1;

				int j=0;
			for(int i=0;i<arr.length;i++){
				if(arr[i]>=0){
					arr2[j]=arr[i];
					j=j+2;
				}else{
					arr2[z]=arr[i];
					z=z+2;
				}
			}

			 for(int i=0;i<arr2.length;i++){
                      System.out.println(arr2[i]);
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

                Alernatepos obj=new Alernatepos();
                obj.Alter(arr);


	      

        }
}

