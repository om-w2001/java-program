// move all negative number to brginning and positive to end with constant extra space

import java.io.*;
class Brginning{

        void posneg(int arr[]){
         
		int neg[]=new int[arr.length];
		int pos[]=new int[arr.length];
			
		int j=0,z=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				neg[j]=arr[i];
				j++;
			}if(arr[i]>0){
				pos[z]=arr[i];
				z++;
			}
		}
		j=0;z=0;
		for(int i=0;i<arr.length;i++){
			if(neg[j]<0){
			arr[i]=neg[j];
			j++;
			}else if(pos[z]>0){
				arr[i]=pos[z];
				z++;
			}
		}


		System.out.println("output");

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
        }
         public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the size");
                int size=Integer.parseInt(br.readLine());

                int arr[]=new int[size];
        

                System.out.println("Enter the Array1:");
                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }

                Brginning obj=new Brginning();
                obj.posneg(arr);
         }
}

