/* WAP to print the number divisible by 3 and 7 between a given range from user start the range from reverse
input: Enter start  30
       Enter end    80
output      63    42
*/

class num{
	public static void main(String[] args){
		int start=30;
		int end=80;

		for(int i=end ;i>=start;i--){
			if(i%3==0&&i%7==0){
				System.out.print(i+" ");
			}
		}
	}
}
