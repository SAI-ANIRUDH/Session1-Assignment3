import java.util.Scanner;

public class Assignment3 {

public static void main(String[] args) {
		
byte x,y; //Declaring variables//

Scanner sc = new Scanner(System.in); //Using Scanner class for having the variables to be defined by the user//

System.out.println("Enter the x value");	

x=sc.nextByte();    // Initializing x variable//

System.out.println("Enter the y value");	

y=sc.nextByte();   // Initializing x variable//

System.out.println("Bitwise And is "+(x & y)); //Result of Bitwise Operator//

if ((x==sc.nextByte()) && (y==sc.nextByte()))
{
	System.out.println("Logical And is "+((x==sc.nextByte()) && (y==sc.nextByte())));	//Result of Logical Operator//
}

	}

}