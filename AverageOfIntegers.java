package NACodingQuestions;

import java.util.Scanner;

public class AverageOfIntegers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int range = sc.nextInt();
		System.out.println("Enter the Numbers : ");
		int num;
		
		int sum=0;
		int count=0;
		for(int i=0;i<range;i++) {
			 num = sc.nextInt();
			 count++;
			 sum = sum + num;
		}
		double avg = sum/count;
		System.out.println("The average of all numbers is : " + avg);
		
		
		
		
		
		

	}

}
