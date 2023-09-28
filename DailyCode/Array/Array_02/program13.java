/*WAP to find the uncommon elements between two arrays.
Input :
Enter first array : 1 2 3 5
Enter Second array: 2 1 9 8
Output: Uncommon elements :
3
5
9
8
*/


import java.io.*;
class ArraryDemo{
        static void xyz(int arr[],int arr2[]){
              System.out.println("unCommon element");
	     int x=0;
	     int z=0;
		     for(int j=0;j<arr.length;j++){
		    if(arr[x]==arr2[j]){ 
			   
				    x++;
			    break;
			    
			    }
		  
		     }
		     x++;
		    
		     
		     while(x<arr.length){
			     System.out.println(arr[x]);
			     x++;
		     }
	
                 
		    for(int j=0;j<arr2.length;j++){
                    if(arr2[z]==arr[j]){
                            z++;
                            break;

                    }
                     }
                     z++;
		     
		    
                     while(z<arr2.length){
                             System.out.println(arr2[z]);
                             z++;
                     }

		  
	     }
	
	
	
        public static void main(String[] args)throws IOException{
                System.out.print("Enter the size:");
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          int size=Integer.parseInt(br.readLine());
          int arr[]=new int[size];
          int arr2[]=new int[size];
                 System.out.print("Enter the array element:");
         for(int i=0;i<arr.length;i++){
                  arr[i]=Integer.parseInt(br.readLine());
         }
         System.out.print("Enter the second array");
         for(int i=0;i<arr.length;i++){
                  arr2[i]=Integer.parseInt(br.readLine());
         }


        xyz(arr,arr2);

        }
}

