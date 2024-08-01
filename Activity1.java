Q1 update part :
//1.Write a Java program that takes an array of numbers as input from the user, filters out the even numbers, 
//displays them, and calculates their sum. The user should be able to input random numbers.
package lab;
import java.util.*;
public class Activity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int a=sc.nextInt();
		int[] b=new int[a];
		System.out.println("enter array element: ");
		for(int i=0;i<a;i++) {
			b[i]=sc.nextInt();
			
		}
		int sum=0;
		for(int k:b) {
			sum=sum+k;
			if(k%2==0) {
				System.out.println("even numbers are: "+k);
			}
		}
		System.out.print("original Araays elements are: ");
		System.out.println(Arrays.toString(b));
		
		System.out.println("sum of entered elements are: "+ sum);
		
		
		
		sc.close();
	}

}


//output 

//enter the size of an array
//5
//enter array element: 
//1
//4
//5
//6
//2
//even numbers are: 4
//even numbers are: 6
//even numbers are: 2
//original Araays elements are: [1, 4, 5, 6, 2]
//sum of entered elements are: 18
