import java.util.*;
public class assignment6{
	static void quest1(){
		System.out.println("Q.1 Write a program to print duplicate characters in string");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String n = sc.nextLine();
		char[] carr = n.toCharArray();
		System.out.println("Duplicate character in string are");
		for(int i=0;i<n.length();i++){
			for(int j=i+1;j<n.length();j++){
				if(carr[i]==carr[j]){
					System.out.println(carr[j]+" ");
					//break;
				}
			}
		}	
	}
	static void quest2(){
		System.out.println("Q.2 Write a program to find vowels present in string.");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String n = sc.nextLine();
		char[] carr = n.toCharArray();
		for(int i=0;i<n.length();i++){
			if(carr[i]== 'a' ||carr[i]== 'e'||carr[i]=='i' ||carr[i]== 'o'||carr[i]== 'u'){
				System.out.println(carr[i]);
			}
		}
	}
	static void quest3(){
		System.out.println("Q.3 Write a program to remove given character from String.");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String n = sc.nextLine();
		System.out.println("Enter string/character to be remmoved ");
		String d = sc.nextLine();
		String newstr= n.replace(d, "");
		System.out.println(newstr);
	}
	static void quest4(){
		System.out.println("Q.4 Write a program to write methods present in StringBuffer and StringBuilder");
		StringBuilder strd=new StringBuilder(" chicken ");
		StringBuilder strd1=new StringBuilder(" Tandoori");
		StringBuffer strf=new StringBuffer(" Apple ");
		StringBuffer strf1=new StringBuffer(" candy ");
		System.out.println("string builder 1 " + strd);
		System.out.println("string builder 2 " + strd1);
		System.out.println("string buffer 1 " + strf);
		System.out.println("string buffer 2 " + strf1);
		System.out.println("builder append " + strd1.append(strd));
		System.out.println("buffer append " + strf1.append(strf));
		System.out.println("builder reverse " + strd1.reverse());
		System.out.println("buffer reverse  " + strf1.reverse());
		
		
	}

	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		menu : while(true){
		System.out.println("---------------------------------------");
		System.out.println("Enter question number ---");
		System.out.println("or enter 5 to exit the program");
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
				case 5:break menu;
			default:System.out.println("Input valid choice");
			}
		System.out.println();
		System.out.println("---------------------------------------");
	}	}
	
}
