package algorithm;

import java.util.Scanner;

/*
 * this type of question should be solved by Rabin–Karp algorithm.
1 function RabinKarp(string s[1..n], string pattern[1..m])
2   hpattern := hash(pattern[1..m]);
3   for i from 1 to n-m+1
4     hs := hash(s[i..i+m-1])
5     if hs = hpattern
6       if s[i..i+m-1] = pattern[1..m]
7 
        return i
8   return not found
 */

public class findPattern {
  public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
      int N = s.nextInt();
      
      for(int i=0; i<N; i++){
    	  int number = s.nextInt();
    	 
    	  if(number%21 == 0){
    		  System.out.println("The streak is broken!");
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
	  
	  int pattern = 21;
	  boolean flag = false;
	  
	  String sPattern = String.valueOf(pattern);
	  String sNumber = String.valueOf(number);
	  
	  int m = sPattern.length();
	  int n = sNumber.length();
	  
	  int hashCodePattern = sPattern.hashCode();
	  
	  for(int i=0; i<n-m+1; i++){
		  
		  String expect = sNumber.substring(i,i+m);
		  int hashCodeNumber = expect.hashCode();
		  
		  if(hashCodeNumber == hashCodePattern){
			  if(sPattern.equals(expect)){
				  flag = true;
			  }
		  }
	  }
	return flag;
  }
}
