package algorithm;

public class timeConversion {
public static void main(String[] args) {
	String s = "12:01:00PM";
	String timeZone = s.substring(8);
	String time = s.substring(0,2);
    if(timeZone.equals("AM")){
    	if(time.equals("12")){
    		System.out.println(s.substring(0,8).replaceFirst("12","00"));
    	}
    	else{
    		System.out.println(s.substring(0,8));
    	}
    }
    else if(timeZone.equals("PM")){
    	int tt = Integer.parseInt(time);
    	if(tt==12){
    		System.out.println(s.substring(0,8));
    	}
    	else{
    		int exactTime = tt+12;
    		System.out.println(exactTime+s.substring(2,8));
    	}
    }
    else{
    	System.out.println("time is not in proper format");
    }
}
}
