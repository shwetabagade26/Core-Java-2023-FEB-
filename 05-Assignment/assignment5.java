import java.util.*;
public class assignment5{
	static void quest1(){
		System.out.println("Q.1 Write a program to display reverse an array.");
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int arr2[] = {1,2,3,4,5,6,7,8,9};
		System.out.print("Original Array -");
		for(int i=arr2.length-1;i>=0;i--){
			System.out.print(arr2[i]+" ");
		}
		System.out.println("Reversed Array -");
		for(int i=arr2.length-1;i>=0;i--){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
	}
	static void quest2(){
		System.out.println("Q.2 Write a program to display concatenate of two arrays");
		int arr[] = {1,2,3,4};
		int arr2[] = {5,6,7,8};
		int len1 = arr.length;
		int len2 = arr2.length;
		int len = len1 + len2;
		int [] newarr=new int[len];
		for(int i=0;i< len1;i++){
			newarr[i]=arr[i];
		}
		for(int i=0;i<len2;i++){
			newarr[len1 + i]=arr2[i];
		}
		for(int i=0;i< len;i++){
			System.out.print(newarr[i]+" ");
		}
		System.out.println();
	}
	static void quest3(){
		System.out.println("Q.3 Write a program to largest number present in Array");
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int max=arr[0];
		for(int i=0;i<=arr.length-1;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}		
		System.out.println(max);
	}
	static void quest4(){
		System.out.println("Q.4 Write a program to reverse string without using reverse method");
		String s="loop" ;
		System.out.println(s);
		String rev="";
		for(int i=0;i<=s.length()-1;i++){
			char ch=s.charAt(i);
			rev=ch+rev;
		}	
		System.out.println(rev);
	}
	static void quest5(){
		System.out.println("Q.5 Write a program to convert string into integer value");
		String s="300";
		int i=Integer.parseInt(s);
		System.out.println(i);
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
