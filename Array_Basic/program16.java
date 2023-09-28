// Last index of one

import java.io.*;
class LastOne{

	void last(String arr){
		char x='1';
		int m=0;
		for(int i=0;i<arr.length();i++){
			if(x==arr.charAt(i)){
			//	System.out.println(i);
			m=i;
			}

		}
		System.out.println(m);
	}
	public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               String arr=new String(br.readLine());
	       LastOne obj=new LastOne();

	       obj.last(arr);
	}
}	
