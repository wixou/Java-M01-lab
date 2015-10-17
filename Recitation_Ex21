import java.util.Scanner;

public class Lab1 {
	
	public static void main(String[] args) {
	
		long year, month, day, hour, minute, second, d;
		long time = System.currentTimeMillis();
		
		time /= 1000;
		
		year = time / 31536000;
		d = time % 31536000;
		
		month = d / 2592000;
		d = d % 2592000;
		
		day = d / 86400;
		d = d % 86400;
		
		hour = d / 3600;
		d = d % 3600;
		
		minute = d / 60;
		second = d % 60;
		
		System.out.println(hour+ ":" +minute+ ":" +second);

	}

}
