import java.util.*;
public class assignment4{
	static void quest1(){
		System.out.println("Q.1 Write a program to calculate the sum of first 10 natural  ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range :");
		int range= sc.nextInt();
		int sum=0;
		for(int i=0;i<=range;i++){
				sum+=i;
		}
		System.out.println(sum);
	}
	static void quest2(){
		System.out.println("Q.2 Write a Java Program to find sum of Even Numbers");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range :");
		int range= sc.nextInt();
		int sum=0;
		for(int i=2;i<=range;i+=2){
				sum+=i;
		}
		System.out.println(sum);
	}
	static void quest3(){
		System.out.println("Q.3 Write a Program to display table of 5.");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to get table of that number");
		int a = input.nextInt();
		int i;
		for(i=1;i<=11;i++){
			System.out.println((a) + " x " + (i)+ " = " + (a*i));
		}	
	}
	static void quest4(){
		System.out.println("Q.4 Write a program to print Fibonacci series of n terms where n is input by user.");
		Scanner input = new Scanner(System.in);
		int a=0,b=1;
		System.out.println("Enter the range");
		int c = input.nextInt();
		for(int i=1;i<=c;++i){
			System.out.print(a + "  ");
			int d= a+b;
			a=b;
			b=d;
		}
	}
	static void quest5(){
		System.out.println("Q.5 Write a Program to display Factorial of number entered by user");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number for factorial");
		int a = input.nextInt();
		int b=1;
		for(int i=1;i<=a;++i){
			b=b*i;
		}
		System.out.println(b);
	}
	static void quest6(){
		System.out.println("Q.6 Write a Program to display star pattern of square of 5*5");
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void quest7(){
		System.out.println("Q.7 Write a Java Program to find area of Triangle by taking user Input.");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter of height of a triangle = ");
		int a = input.nextInt();
		System.out.println("Enter of base of a triangle = ");
		int b = input.nextInt();
		System.out.print("Area of a triangle is = ");
		System.out.print(0.5*a*b);
	}
	static void quest8(){
		System.out.println("Q.8 Write a Java Program to find Odd numbers Present in array {2,3,4,8,7,1,6,5};");
		int arr[]={2,3,4,8,7,1,6,5};
		int sum=0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]%2!=0){
				System.out.println("Odd numbers  " + arr[i]);
			}
		}
		System.out.println(sum);
	}
	static void quest9(){
		System.out.println("Q.9 Write a Java Program to find sum of Odd Numbers.");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range :");
		int range= sc.nextInt();
		int sum=0;
		for(int i=1;i<=range;i++){
			if(i%2!=0){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	static void quest10(){
		System.out.println("Q.10 Write a Java program to find area of rectangle by taking user Input.");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter of length of a rectangle = ");
		int a = input.nextInt();
		System.out.println("Enter of breadth of a rectangle = ");
		int b = input.nextInt();
		System.out.print("Area of a rectangle is = ");
		System.out.print(a*b);
	}
	static void quest11(){
		System.out.println("Q.11 Write a Program to display star pattern of Triangle.");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the height of triangle");
		int h= input.nextInt();
		for(int i=0;i<h;i++){
			for(int j=0;j<h-i-1;j++){
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		menu : while(true){
		System.out.println("---------------------------------------");
		System.out.println("Enter question number ---");
		System.out.println("or enter 12 to exit the program");
		int g = input.nextInt();
			switch (g){
				case 1: quest1();
				break;
				case 2: quest2();
				break;
				case 3: quest3();
				break;
				case 4: quest4();
				break;
				case 5: quest5();
				break;
				case 6: quest6();
				break;
				case 7: quest7();
				break;
				case 8: quest8();
				break;
				case 9: quest9();
				break;
				case 10: quest10();
				break;
				case 11: quest11();
				break;
				case 12:break menu;
			default:System.out.println("Input valid choice");
			}
		System.out.println("---------------------------------------");
	}	}
	
}
