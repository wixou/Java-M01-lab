import java.util.Scanner;

public class Lab1 {

public static void main(String[] args) {
		
		double area, circumference, radius;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please entre the value of the diameter !!");
		double diameter = input.nextDouble();
		
		radius = diameter / 2;
		area = Math.PI * Math.pow(radius,2);
		circumference = 2 * Math.PI * radius;
		
		System.out.println("The area of the circle is "+area);
		System.out.println("The circumference of the circle is "+circumference);
		
		
	}

}
