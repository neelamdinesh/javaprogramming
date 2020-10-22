import java.util.Scanner;
public class experiment10{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
		int a,b;
		a=input.nextInt();
	    b=input.nextInt();
	   int c=a,d=b;
	   while(c!=d){
	       if(c>d)
	        c-=d;
	        else
	        d-=c;
	   }
	    System.out.print("value of "+a+"/"+b+" = ");
	    System.out.print(a/d+"/"+b/c);
	}
}