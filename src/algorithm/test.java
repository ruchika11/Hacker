package algorithm;

import java.util.Scanner;

public class test {
	 public static void main(String args[] ) throws Exception {
	      

	        //Scanner
	        Scanner s = new Scanner(System.in);
	        int N = s.nextInt();
	        

	        for (int i = 0; i < N; i++) {
	        	int number = s.nextInt();
	        	if(number%21==0){
	        		System.out.print("The streak is broken!");
	        	}
	        	else if(find(number)){
	        		System.out.println("The streak is broken!");
	        	}
	        	else{
	        		System.out.println("The streak lives still in our heart!");
	        	}
	        }
	     }
	 
	 public static boolean find(int number){
		 while(number>20){
     		int firstpos = number%10;
     		number = number/10;
     		int secondPos = number%10;
     		if(firstpos ==1 && secondPos==2){
     			return true;

     		}
     		else if(number==21){
     			return true;
     		}
     		number = number/10;
		 }
		 return false;
	 }
	 
    	 
}

