import java.util.Scanner;
public class Mid {
	public static void main(String[] args) {
	Scanner scen = new Scanner(System.in);
	float var ;
	System.out.println("enter a grade from 0 to 100");
	var =scen.nextFloat();
	if (var >= 90 && var <= 100){
	   System.out.println(+ var +  "A");
	}else if (var >= 80 ){
		//grade is greater than 80, but not equal
	    System.out.format("Good job with" + var +  "out of 100" );
	}else if (var >= 60){
		//grade is greater than 60, but not equal
	    System.out.format("passed the course with" + var + "out of 100");
	}else {
	    System.out.println("sorry you fail or yuo entered a wrong grade");
	}

	}
}
