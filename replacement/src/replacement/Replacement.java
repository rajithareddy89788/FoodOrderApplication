package replacement;

import java.util.Scanner;

public class Replacement {
 public static void main(String[] args)
 {
	 System.out.println("enter string to check");
	 Scanner scan=new Scanner(System.in);
	 String t=scan.nextLine();
	String even="";
	String odd="";
	 for(int j=0;j<t.length();j++)
	 {
		 if(j%2==0)
		 {
			 even+=t.charAt(j);
			
			 
		 }
		
		 
		 else
		 {
			 odd+=t.charAt(j);
		 }
		 
	 }
	
	 
String a="aaa"	; 
String b="bb";

	even=a;
	odd=b;
 
	 System.out.println(even+" "+odd);
	 
 }
}
