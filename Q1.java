Quetion :
1.Write a Java program that takes an array of numbers as input from the user, filters out the even numbers, displays them, and calculates their sum. The user should be able to input random numbers.

package lab;
import java.util.*;
public class Activity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int a=sc.nextInt();
		int[] b=new int[a];
		for(int i=0;i<a;i++) {
			b[i]=sc.nextInt();
			
		}
		
		for(int k:b) {
			if(k%2==0) {
				System.out.println("even numbers are: "+k);
			}
		}
		System.out.println("original Araays elements are: ");
		System.out.print(Arrays.toString(b));
		
		
		
		
		
		sc.close();
	}

}
