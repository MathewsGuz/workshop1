package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication2 {

	static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        return a.equalsIgnoreCase(b);
             
        
            
    }

    public static void main(String[] args) {
    
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();        
        int i=1;
        System.out.println(i+" "+a);
        while( scan.hasNext() ) {          	
        	a = scan.nextLine();        	
        	i+=1;
        	System.out.println(i+" "+a);        	      	
        }               
    }
}
