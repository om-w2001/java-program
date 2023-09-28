/*take an integer n as input
print odd integers from 1 to n using loop
*/

class odd{
	public static void main(String[] args){
		int i=1;
		while(i<=10){
			if(i%2!=0){
				System.out.println(i);
			}
			i++;
		}
	}
}
