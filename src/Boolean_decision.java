import java.util.*;

public class Boolean_decision {
	public static void main(String[] args) {
		
		//grade calculation
		System.out.print("Enter your test score: ");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		char grade = 'F';//I'm not hopeful

		if (score > 89)
		{
		    grade = 'A';
		}
		else if (score > 79)
		{
		    grade = 'B';
		}
		else if (score > 69)
		{
		    grade = 'C';
		}
		else if (score > 59)
		{
		    grade = 'D';
		}
		else 
		{
		    grade = 'F';
		}
		
		System.out.println(grade);
		
		if(score%10 == 0||score%10 == 1||score%10 == 2)
		{
			System.out.println("-");
		}
		else if(score%10 == 7||score%10 == 8||score%10 == 9)
		{
			System.out.println("+");
		}
		

		if (score > 69)
		{
		    System.out.println("Very good! You don't have to retake the exam!");
		}
		else
		{
		    System.out.println("Did you even look at the book?");
		}
		
		
		
	/* Triangle calculator*/
		
		System.out.println("Please give input of 3 sides of triangle: ");
		int side1,side2,side3;
		side1= scan.nextInt();
		side2= scan.nextInt();
		side3= scan.nextInt();
		
		if(side1==side2 && side2==side3)
		{
			System.out.println("Equilateral Triangle");
		}
		if((side1*side1==(side2*side2+side3*side3)) ||(side2*side2==(side1*side1+side3*side3)) ||(side3*side3==(side1*side1+side2*side2)))
		{
			System.out.println( "Right Triangle");
		}
		else
		{
			System.out.println( "Not an Equilateral Triangle and not a Right Triangle");
		}
		
		/*Comparing Strings*/
		
		System.out.println("How is the weather?");
        String answer = scan.next();

        if (answer.equals("rain"))
            System.out.println("Take your umbrella!");
        else if (answer.equals("windy"))
            System.out.println("Wear your jacket!");
        else if (answer.equals("snow" ))
            System.out.println("Wear a coat and take a shovel!");
        else
            System.out.println("Enjoy your day!");
		
		
	}

}
