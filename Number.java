import java.util.Scanner;
public class Number {

public static void main(String[]args) {
	int number;
	Scanner num=new Scanner(System.in);
	System.out.println("Enter Any Number");
	number=num.nextInt();
	String Result=number<0?"Negative Number":"Positive Number";
	System.out.println("Input is "+Result);	
}
}
