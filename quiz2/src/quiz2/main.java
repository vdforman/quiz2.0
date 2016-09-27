package quiz2;

import java.util.Scanner;

public class main {
	
	public static double Tuition;
	public static double increase;
	public static double Interest;
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		double Tuition;
		double increase;
		double finaltuition;
		
		System.out.print("How much is the tuition of your first year?");
		Tuition = input.nextDouble();
		
		finaltuition = Tuition;
		for (int i = 0; i < 3; i++)
		{
			System.out.println("What's your interest rate on your tuition as a percent");
			increase = input.nextDouble();
			increase =(increase/100);
			finaltuition +=(Tuition*(1+increase));
		}
		
		input.close();
		
		System.out.printf("After four years, your tuition will be $ %.3f ", finaltuition);

	}

}
