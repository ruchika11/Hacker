package algorithm;

import java.util.Scanner;

public class squareTransaction {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int[] aArray = new int[a];
	
	int exist = 0 ;
	
	for(int i=0; i<a; i++){
		aArray[i] = sc.nextInt();
	}
	
	int b = sc.nextInt();
	
	for(int i=0; i<b; i++){
		int number = sc.nextInt();
		int x = day(number,aArray);
		System.out.println(x);
	}
			
}

public static int day(int n, int[] nArray){
	int day = -1;
	int sum = 0 ;
	for(int j=0; j<nArray.length; j++){
		
		sum = sum + nArray[j];
		if(sum>=n){
			day = j+1;
			break;
		}
		
	}
	return day;
	
}
}
