package algorithm;

import java.util.Scanner;
import java.util.StringTokenizer;

public class breakUpApp {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int tc = sc.nextInt();
	sc.nextLine();
	int[] warr = new int[31];
	
	
	for(int j=0; j<tc; j++){
		String s = sc.nextLine();
		String str = s.replaceAll("[a-zA-z:]+"," ");
		String[] sarr = str.trim().split("[ ]+");
		
		StringTokenizer st = new StringTokenizer(str,"[ ]+");
		int numberOfSubstrings = st.countTokens();
		
		if(numberOfSubstrings>0){
			for(int i=0; i<sarr.length; i++){
				int date = Integer.parseInt(sarr[i]);
				
				if(s.charAt(0)=='G'){
					warr[date] = warr[date]+2;
				}
				if(s.charAt(0)=='M'){
					warr[date] = warr[date]+1;
				} 
			}
		}
	
		
	}
	
	int max = warr[0];
	int maxPos = 0;
	  
	  for(int i=1; i<warr.length; i++){
	     if(warr[i]>max){
			  max = warr[i];
			  maxPos = i;
		  }
	  }
	  
	  if(maxPos == 19 || maxPos == 20){
		 System.out.println("Date"); 
	  }
	  else{
		  System.out.println("No Date");
	  }
	
}

//solution with less time taken

//public static void main(String args[] ) throws Exception {
//  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//	Integer stringCount=Integer.parseInt(br.readLine());
//	Integer isDateCount=0;
//	Integer isNonDateCount=0;
//	while(stringCount-->0){
//		String msgString=br.readLine();
//		if(msgString.contains("M:")){
//		    if(msgString.contains("19")){
//		        isDateCount+=1;   
//		    }
//		    if(msgString.contains("21")){
//		        isNonDateCount+=1;
//		    }
//		}
//		if(msgString.contains("G:")){
//		    if(msgString.contains("19")){
//		        isDateCount+=2;   
//		    }
//		    if(msgString.contains("21")){
//		        isNonDateCount+=2;
//		    }
//		}
//	}
//	if(isDateCount<=isNonDateCount){
//		System.out.println("No Date");
//	}
//	else{
//		System.out.println("Date");
//	}
//}




 
}


