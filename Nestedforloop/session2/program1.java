/* Wap to print th odd number as it is and cude of even numbers between a given range from the user
    Input: Enter Start 10
           Enter End 20
	    Output 1000 11 1728 13 2744 15 4096 17 5832 19 8000
*/

class cube{
	public static void main(String[] args){
		int start=10;
		int end=20;
		for(int i=10;i<=20;i++){
			if(i%2!=0)
				System.out.print(i+" ");
			else
				System.out.print(i*i*i+" ");
		}
	}
}
