/* write a program to calculate the factorial of the given number
input:6
output:720
*/

class Demo{
	public static void main(String[] args){
		int x=6;
		int i=1;
		while(x>=1){
			i=i*x;
			x--;
		}
		System.out.println(i);

	}
}
