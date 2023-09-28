/* 1. WAP to print the square of odd number between a given range from user
 input :Enter start   10
        Enter End     20

output : 121 169 225 289 361  
*/

class Demo{
	public static void main(String[] args){
		int x=10;
		int y=20;
		for(int i=x;i<y;i++){
			if(i%2!=0){
			System.out.print(i*i+" ");
			}
			
			
		}
	}
}
