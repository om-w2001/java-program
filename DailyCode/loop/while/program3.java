/* write a program to count the digits of the given number 
input:942111423
output:9
*/

class Demo{
	public static void main(String[] args){
	       int x=942111423;
		int count=0;
			while(x!=0){
		count++;
x=x/10;
			}
			System.out.println(count);
	}
}
