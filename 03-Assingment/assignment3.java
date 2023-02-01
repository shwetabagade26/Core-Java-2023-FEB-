import java.util.*;
public class assignment3{
	static void quest1(){
		System.out.println("Q1-Write a Program to display Following operations");
		double a = 151.23f;
		double b = 2515.51f;
		float c = (float)(a + b);
		float d = (float)(a - b);
		float e = (float)(a * b);
		float f = (float)(a / b);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
	static void quest2(){
		System.out.println("Q.2 Write a Program to display Following operations.");
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
