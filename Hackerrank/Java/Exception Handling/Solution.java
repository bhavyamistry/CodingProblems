import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        try{
            int x = sc.nextInt();
            int y = sc.nextInt();
            // System.out.println(y);    
            // System.out.println(x);
            System.out.println(x/y);
        }
        catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}