import java.util.*;
public class assignment2{
	static void quest1(){
		System.out.println("Q.1 Find the output of following code.");
		int x = 9, y = 12;
		int a = 2, b = 4, c = 6;
		int exp = (3 + 4 * x)/5 - 10 * (y - 5) * (a + b + c)/x + 9 * (4/x + (9 + x)/y);
		System.out.println(exp);
	}
	static void quest2(){
		System.out.println("Q.2 Find the output of following code.");
		int x = 200, y = 50, z = 100;
		if(x > y && y > z){
			System.out.println("Hello");
		}
		System.out.println("False Condition");	
	}
	static void quest3(){
		System.out.println("Q. 3 Find the output of following code.");
		int x = 1, y = 2, z = 5;
		if(x == 1 || x > y || x > z){
			System.out.println("One");
		}
	}
	static void quest4(){
		System.out.println("Q.4.Will this code Compile Successfully.? if then guess theoutput");
		int x, y, z;
		x = y = z = 2;
		x += y;
		y -= z;
		z /= (x + y);
		System.out.println(x + " " + y + " " + z);
	}
	static void quest5(){
		System.out.println("Q.5 Will this code Compile Successfully.? if then guess theoutput.");
		System.out.println(" 1=x; isn't correct way of assigning variable"); 
	}
	static void quest6(){
		System.out.println("Q.6 Write a program to check if the two numbers 23 and 45 are equal.");
		int x = 23, y = 45;
		if(x == y){
			System.out.println( x +" equal to" + y);
		}
		else{System.out.println( x +"is NOT equal to" + y);}
	}
	static void quest7(){
		System.out.println("Q.7 Guess the output of the following code.");
		int i = 3;
		i++;
		System.out.println(i); // "4" 
		++i;
		System.out.println(i); // "5" 
		System.out.println(++i); // "6" 
		System.out.println(i++); // "6" 
		System.out.println(i); // "7"
	}
	static void quest8(){
		System.out.println("Q.8 Guess the output of the following code.");
		int i = 7;
		int output = ++i + ++i + ++i;
		System.out.println(output);
	}
	static void quest9(){
		System.out.println("Q.9 What will be the output of the following program?");
		int a = 1;
		int b = 2;
		int c;
		int d;
		c = ++b;
		d = a++;
		c++;
		System.out.println("a = " + a);
		System.out.print("b = " + b);
		System.out.println("c = " + c);
		System.out.print("d = " + d);
	}
	static void quest10(){
		System.out.println("Q.10.");
		int val1 = 10;
		int val2 = 20;
		int val3 = 30;
		int val4 = 40;
		int result1, result2, result3, result4;
		result1 = ++val1;
		result2 = val2++;
		result3 = --val3;
		result4 = val4--;
		System.out.println("Value 1 = " + val1);
		System.out.println("Value 2 = " + val2);
		System.out.println("Value 3 = " + val3);
		System.out.println("Value 4 = " + val4);
		System.out.println("Result 1 = " + result1);
		System.out.println("Result 2 = " + result2);
		System.out.println("Result 3 = " + result3);
		System.out.println("Result 4 = " + result4);
	}
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		menu : while(true){
		System.out.println("---------------------------------------");
		System.out.println("Enter question number ---");
		System.out.println("or enter 11 to exit the program");
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
				case 11:break menu;
			default:System.out.println("Input valid choice");
			}
		System.out.println("---------------------------------------");
	}	}
	
}
