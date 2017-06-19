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
		
        /*What if debugging activity*/
        
        String fname, lname;
		double gpa;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Student's First Name? " );
		fname = keyboard.next();
		
		System.out.print( "Student's Last Name? " );
		lname = keyboard.next();

		System.out.print( "Student's GPA? " );
		gpa = keyboard.nextDouble();
		
		System.out.println();
		System.out.println("Student Name :" + fname + " " + lname);
		System.out.println("Student GPA :" + gpa);
		if (gpa >= 3)
		{
			System.out.println("This student is in good standing.");
		} else if (gpa == 1)
		{
			System.out.println("This student is on academic probation.");
		} else
		{
			System.out.println("This student has been expelled.");
		}
		
		
		/*What if change activity*/
		
		String fnam, lnam, status;
		double cgpa;
		int hours;



		System.out.print( "Student's First Name? " );
		fnam = keyboard.next();

		System.out.print( "Student's Last Name? " );
		lnam = keyboard.next();

		System.out.print( "Student's GPA? " );
		cgpa = keyboard.nextDouble();

		System.out.print( "Student's Current Course Load? " );
		hours = keyboard.nextInt();

		System.out.println();
		if(hours >=12)
		{
			System.out.println("Student Name :" + fnam + " " + lnam);
			System.out.println("Student GPA :" + cgpa);
			System.out.println("Status :" + "Fulltime");
			if (cgpa >= 3)
			{
			System.out.println("This student is in good standing.");
			} else if (cgpa >= 2)
			{
			System.out.println("This student needs to study more.");
			} else if (cgpa >= 1)
			{
			System.out.println("This student is on academic probation.");
			} else
			{
			System.out.println("This student has been expelled.");
			}
		}
		
		
		/*What if completion activity   sum, product and average
		 *     If the calculated sum is over 200, print an asterisk next to the sum.*/
		
		int num1, num2;
		System.out.print( "First Number? :" );
		num1 = keyboard.nextInt();
		
		System.out.print( "Last Number?  :" );
		num2 = keyboard.nextInt();
		
		System.out.println("sum : " + (num1+num2));
		if((num1+num2)>200)
		{
			System.out.println("*");
		}
		System.out.println("product : " + (num1*num2));
		System.out.println("average : " + (num1+num2)/2);
		
		/*What if activity
		 * Customer ID: 101
			Customer Name: Bart Simpson
			Sales Amount: $500.00
			Tax Code: NPF
			Total Amount Due: $500.00
			
			tax code	tax amount
			NRM	6%
			NPF	0%
			BIZ	4.5%

		 	*/
		
		int id;
		double sales_amount,total_amount;
		String customer_name,tax_code;
		
		
		System.out.println("What's your customer ID? : ");
		id = keyboard.nextInt();
		System.out.println("What's your name? : ");
		customer_name = keyboard.next();
		System.out.println("Please input your sales amount: ");
		sales_amount = keyboard.nextDouble();
		System.out.println("Please input your tax_codet: ");
		tax_code = keyboard.next();
		System.out.println(" Customer ID : " + id);
		System.out.println(" Customer Name : " + customer_name);
		System.out.println(" Sales Amount : " + sales_amount);
		System.out.println(" Tax code : " + tax_code);
		if(tax_code.equals("NPF"))
		{
			System.out.println("Total Amount Due: " +sales_amount);
		}
		else if(tax_code.equals("NRM"))
		{
			System.out.println("Total Amount Due: " +(sales_amount+sales_amount*.006));
		}
		else if(tax_code.equals("BIZ"))
		{
			System.out.println("Total Amount Due: " +(sales_amount+sales_amount*.045));
		}
		
		
	}

}
