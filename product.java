
import java.util.Scanner;

public class product {
	String product_name;
	int price;
	float disc;
	
	
	void input()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Product Name");
		product_name=s.next();
		System.out.println("Enter Price");
		price=s.nextInt();

	}
	void show()
	{
		System.out.println("Product name= "+product_name+"\nPrice= "+price);
	}
  void calculate()
  {
	  if(price>2000) {
		  System.out.println("Discount is 10%");
		  disc=price*0.9f;
		  System.out.println("\nDiscounted Price is "+disc);
	  }
	  else {
		  System.out.println("Discount is 7%");
		  disc=price*0.93f;
		  System.out.println("\nDiscounted Price is "+disc);
	  }
  }
	public static void main(String[] args) {
		product p= new product();
		p.input();
		p.show();
		p.calculate();
	}
	}


