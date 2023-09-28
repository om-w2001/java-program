// Remove duplicate elements from sorted array

import java.io.*;
import java.util.*;
class Removedup{

        void remove(int arr[]){

		HashSet<Integer> hs=new HashSet<>();

		for(int i=0;i<arr.length;i++){
			hs.add(arr[i]);
		}

		Iterator it=hs.iterator();

		while(it.hasNext()){
			int s=(int)it.next();

			System.out.println(s);
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

                Removedup obj=new Removedup();
              obj.remove(arr);


        }
}

