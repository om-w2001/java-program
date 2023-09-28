/* write a program and take two characters if these characters are equal then print them as  it is but if they are unequal then print their difference
 

   input a p
   output the difference between a and p is 15

   */
import java.util.*;
import java.io.*;
class Xyz{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the char:");

                String x=br.readLine();

	StringTokenizer obj=new StringTokenizer(x," ");

	String token1=obj.nextToken();
	char z=token1.charAt(0);
	String token2=obj.nextToken();
	char c=token2.charAt(0);
	
	System.out.println("the difference between "+token1+" and "+token2+" is "+(c-z));
	}
}


