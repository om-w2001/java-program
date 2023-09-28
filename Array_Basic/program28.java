// Remove Duplicates from unsorted array
//


import java.util.*;
import java.io.*;
class RemoveDupl{
        void removedup(int arr[]){
		
		HashSet<Integer>hs=new HashSet<>();
		
		
		for(int i=0;i<arr.length;i++){
		hs.add(arr[i]);
		arr[i]=0;
			}
		
		int z=0;
		Iterator it=hs.iterator();
		while(it.hasNext()){
			arr[z]=(int)it.next();
			z++;
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
                       
                RemoveDupl obj=new RemoveDupl();
                obj.removedup(arr);
			
		System.out.println("output");
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0&&arr[i+1]==0){
				break;
			}else{
			System.out.println(arr[i]);
			}
		}
        }
}

