import java.util.*;
public class assignment4{
	static void quest1(){
		System.out.println("Q.1 Write a program to display Even or odd numbers ");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if (num%2==0){
			System.out.println(num +" is even number");
		}
		else{
			System.out.println(num +" is odd number");
		}	
	}
	static void quest2(){
		System.out.println("Q.2 Write a program to display Greatest number between 3 numbers");
		int x =15;
		float y =25.51f;
		double z= (double)(x + y);
		double p=(double)(x-y);
		float q= (float)(x*y);
		int r=(int)(x/y);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
	}
	static void quest3(){
		System.out.println("Q.3.Covert the Following value int to float");
		int h = (int)456;
		int i = (int)654;
		int j = (int)789;
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
	}
	static void quest4(){
		System.out.println("Q.4 Convert following values double to short");
		double k = (short)123.32;
		double j = (short)45.321;
		double l = (short)55.55;
		System.out.println(k);
		System.out.println(j);
		System.out.println(l);
	}
	static void quest5(){
		System.out.println("Q.5 Convert following values double to short");
		double m = (short)12.21;
		double n = (short)54.55;
		double p = (short)123.21;
		System.out.println(m);
		System.out.println(n);
		System.out.println(p);
	}
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		menu : while(true){
		System.out.println("---------------------------------------");
		System.out.println("Enter question number ---");
		System.out.println("or enter 6 to exit the program");
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
				case 6:break menu;
			default:System.out.println("Input valid choice");
			}
		System.out.println("---------------------------------------");
	}	}
	
}
