/* WAP take 7 characters an input print only vowels from the array
  input: a b c o d p e
output: a o e
*/




import java.io.*;
class ArraryDemo{
        static void xyz(char arr[]){
                
                for(int i=0;i<arr.length;i++){
                        if(arr[i]=='a'|| arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                                System.out.println(arr[i]);
                        }
                }
                
        }
        public static void main(String[] args)throws IOException{
                System.out.print("Enter the size:");
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          int size=Integer.parseInt(br.readLine());
          char arr[]=new char[size];
                 System.out.print("Enter the array element:");
         for(int i=0;i<arr.length;i++){
                  arr[i]= (char)br.read();
		  br.skip(1);
         }
	 xyz(arr);
        }
}

