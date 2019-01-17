/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 2108263
 */
public class JavaApplication1 {

    
    static boolean isAnagram(String a, String b) {
        if(a.length()==b.length() ){
            a=a.toLowerCase();
            b=b.toLowerCase();
            char tempArraya[] = a.toCharArray();
            char tempArrayb[] = b.toCharArray();
            Arrays.sort(tempArraya);
            Arrays.sort(tempArrayb);
            if (Arrays.equals(tempArraya, tempArrayb)){
                return true;
            }else{return false;}
            
        }else{return false;}
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
    
