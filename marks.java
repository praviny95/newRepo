import java.util.Scanner;

public class marks {
	int marks;
		
	public static void main(String[] args) {
		String Result;
		Scanner s;
		s=new Scanner(System.in);
		marks m=new marks();
			System.out.println("Enter Marks");
			m.marks=s.nextInt();
			Result=m.marks>=40?"Pass":"Fail";
			System.out.println(Result);
	}

}
