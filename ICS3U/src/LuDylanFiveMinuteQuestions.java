import java.util.Scanner;

public class LuDylanFiveMinuteQuestions {
    public static void main(String[] args){
    	int x = 0;
    	System.out.println("Give me a int");
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	System.out.println("Give me a int");
    	int b = sc.nextInt();
    	if (a != 0){
    		x = (a - b) / a;
    		System.out.println(x);
    	}
    	else{
    		System.out.println("Not valid");
    	}
    }
}