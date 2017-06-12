package session1Assignment3;

import java.util.Scanner; //imported scanner package

public class Package_Info //class starts here
{
private static Scanner sc;

public static void main(String[] args) //main method
{
	int a, b;
	
	sc = new Scanner(System.in);
	
	System.out.println(" Please Enter two integer Value: ");
	
	a = sc.nextInt(); 
	
	b = sc.nextInt();
	
	//System.out.format(" Bitwise AND Operator: %d & %d = %d \n", a, b, a & b);
	
	//System.out.format(" Logical AND Operator: %d & %d = %d \n", a, b, (a && b));
	
	System.out.println(a<b&a++<b);
	
	System.out.println(a<b&&a++<b);
}
}
