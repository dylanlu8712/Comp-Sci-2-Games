import java.util.Scanner;

public class more_stuff {
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me three numbers");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		if ((b * b) - (4 * a * c) > 0){
			System.out.println((-b - Math.sqrt((b * b) - (4 * a * c))) / 2 * a);
			System.out.println((-b + Math.sqrt((b * b) - (4 * a * c))) / 2 * a);
		}
		if ((b * b) - (4 * a * c) < 0){
			System.out.println("There are no solutions");
		}
		if ((b * b) - (4 * a * c) == 0){
			System.out.println(-b / (2 * a));
		}
	}
}
//x = (-b +- Math.sqrt(b^2 - 4ac)) / 2a
// if b2 - 4ac is positive, there are two solutions
// if b2 - 4ac is negative then there is no solutions
// if b2 - 4ac is 0 then there are 1 solution
//sqrt gives 2 answers a positive one and a negative one