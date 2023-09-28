/* WAP to print the factorial of given input number from user
 */
import java.io.*;
class Xyz{
	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		 
		System.out.println("Enter the Input:");
	  	int num=Integer.parseInt(br.readLine());
			int fact=1;
		for( int i=num;i>=1;i--){
			fact=fact*i;
		}
			System.out.println("Output :"+fact);
	}
}
