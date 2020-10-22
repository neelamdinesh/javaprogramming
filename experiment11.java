import java.util.*;
public class experiment11{
	public static void main(String[] args) {
		Rectangle rc = new Rectangle();
		rc.print_area();
		Square sq=new Square();
		sq.print_area();
		Circle cr=new Circle();
		cr.print_area();
	}
}
abstract class Shape {
  Scanner input = new Scanner(System.in);
    int a;
    int b;
    public Shape(){
        System.out.println("Enter the value of the");
        a=input.nextInt();
        System.out.println("Enter the  value ");
        b=input.nextInt();
    }
    abstract void print_area();
}
class Rectangle extends Shape{
    void print_area(){
        System.out.println("Area of the Rectangle of length = "+a+" breadth = "+b+" is");
        double area=a*b;
        System.out.println(area);
    }
}
class Square extends Shape{
    void print_area(){
        System.out.println("area of the Square with side "+a+" is");
        double area=a*a; 
        System.out.println(area);
    }
}
class Circle extends Shape{
    void print_area(){
        System.out.println("Area of circle with radius"+a);
        double area=a*a*Math.PI;
        System.out.println(area);
    }
}
