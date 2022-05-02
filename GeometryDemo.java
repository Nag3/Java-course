import java.util.Scanner;

public class GeometryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s=new Square();
		Rectangle r=new Rectangle();
		
		System.out.println("Geometric shapes : Please enter");
		System.out.println("1: Square");
		System.out.println("2: Rectangle");
		System.out.println("3: Exit");
		
		Scanner sc=new Scanner(System.in);
		//System.out.println("1: Square");
		//String i=sc;
		int i=sc.nextInt();
		while(i!=3) {
		switch (i) {
		case 1: System.out.println("You have selected "+i ); 
			s.shape();
			
			break;
		case 2: System.out.println("You have selected "+i );
			r.shape();
			break;
			
		case 3: System.out.println("You have selected" +i+" Exiting...");
		}
		}		
	}

}

interface Draw{
	void drawing();
}
interface Area{
	void calcArea();
}
interface Perimeter{
	void calcPerimeter();
}

abstract class Quadrilateral {
	void shape() {
		System.out.println(" Its a Quadrilateral having 4 sides");
	}
	abstract void nameOfQaud();
}

class Square extends Quadrilateral implements Draw,Area,Perimeter{

	@Override
	public void calcPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Calculating Perimeter of Square:");
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		System.out.println("Calculating Area of Square:");
	}

	@Override
	public void drawing() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a Square");
	}

	@Override
	void nameOfQaud() {
		// TODO Auto-generated method stub
		System.out.println("The name of Quadrilateral is Square");
	}
	void shape() {
		super.shape();
		System.out.println("Its a Square");
	}
	
}
class Rectangle extends Square{

	@Override
	public void calcPerimeter() {
		// TODO Auto-generated method stub
		//super.calcPerimeter();
		System.out.println("Calculating Perimeter of Rectangle:");
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		//super.calcArea();
		System.out.println("Calculating Area of Rectangle:");
	}

	@Override
	public void drawing() {
		// TODO Auto-generated method stub
		//super.drawing();
		System.out.println("Drawing a Rectangle");
	}

	@Override
	void nameOfQaud() {
		// TODO Auto-generated method stub
		//super.nameOfQaud();
		System.out.println("The name of Quadrilateral is Rectangle");
	}

	@Override
	void shape() {
		// TODO Auto-generated method stub
	
		System.out.println("Its a Rectangle ");
	}
	
}