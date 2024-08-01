Quetions: 2.Find the Largest Element using user input. (Solved )

package lab;
import java.util.*;


public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st no ");
		int a=sc.nextInt();
		System.out.println("enter 2nd no ");
		int b=sc.nextInt();
		System.out.println("enter 3rd no ");
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("largest element is "+a);
		}
		else if(b>a && b>c) {
			System.out.println("largest element is "+b);
		}
		else if(c>a && c>b) {
			System.out.println("largest element is "+c);
		}
		else {
			System.out.println("Numbers are equals ");
		}
		
		sc.close();
	}

}
