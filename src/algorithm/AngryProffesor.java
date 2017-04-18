package algorithm;

import java.util.Scanner;

public class AngryProffesor {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int tc = sc.nextInt();
	
	for(int i=0; i<tc; i++){
		int ns = sc.nextInt();
		int ts = sc.nextInt();
		int count = 0;
		
		for(int j=0; j<ns; j++){
			int time = sc.nextInt();
			
			if(time<=0){
				count++;
			}
		}
		if(count==ts){
			System.out.println("NO");
		}
		else{
			System.out.println("YES");
		}
	}
}
}
