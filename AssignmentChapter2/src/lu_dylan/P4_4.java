package lu_dylan; //Name of the package that is stored on my computer with the right naming convention. All lower case with last name then first name.

import java.util.Scanner; //Import for the scanner.

public class P4_4 { //Name of my class which is the question's number as well.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Implementing the scanner
		
		double numberone = sc.nextDouble(); //Number that represents the first number that is typed in
		double numbertwo = sc.nextDouble(); //Number that represents the second number that is typed in 
		
		System.out.println("The sum = " + (double)(numberone + numbertwo) + "\nThe Difference = " + (double)(numberone - numbertwo) + "\nThe Product = " + (double)(numberone * numbertwo) + "\nThe Average = " + (double)(numberone / numbertwo) + "\nThe Distance = " + (double)(Math.abs(numberone - numbertwo)) + "\nThe Maximum = " + (double)(Math.max(numberone, numbertwo)) + "\nThe Minimum = " + (double)(Math.min(numberone, numbertwo))); 
		/*A very long print statement with each of the numbers that is asking. Each of the numbers strings or the lines in quotations are printed as words and then all but the first one have \n which puts the whole new line on a new line. 
		As well each line after that have a double cast and then the numbers because Java thinks that without the cast it is a string and will print the numbers that will inputed. 
		The pattern continues for the rest of the questions. */
		
		sc.close();	//Closes the scanner so that it saves memory.
	}
}
