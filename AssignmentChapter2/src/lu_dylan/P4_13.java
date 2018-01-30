package lu_dylan; //Name of the package that is stored on my computer with the right naming convention. All lower case with last name then first name.

import java.util.Scanner; //Import for the scanner.

public class P4_13 { //Name of my class which is the question's number as well.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Implementing the scanner

		int input = sc.nextInt(); //Finding the integer that is inputed using scanner and making a variable for it

		System.out.println(input % 10 + "\n" + (int)input % 100/10 + "\n" + (int)(input % 1000/100) + "\n" + (int)(input % 10000/1000) + "\n" + (int)(input % 100000/10000));
		/*Prints the numbers in reverse order. 
		This happens because it is the number inputed and then finding the modulus when divided by the number after. It happens in order as well so we take off the rest of the numbers that we don't want after to display one digit at a time.
		The \n puts the number on the next line.
		Every number except the first requires a integer cast because after the first string \n, java thinks that everything after is a string. */
		
		sc.close(); //Closes the scanner to save memory.
	}
}
