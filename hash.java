package pratice01;
import java.util.*;
public class hash {	
	  public static String Reverse(String s, int start, int end) {
	    char[] charArray = s.toCharArray(); 
	    while (start < end) {
	      char temp = charArray[start];
	      charArray[start] = charArray[end];
	      charArray[end] = temp;
	      start++;
	      end--;}
	    return new String(charArray); 	  }
	  public static String Rotateeletoleft(String s, int n, int k) {
	   	    s = Reverse(s, 0, k - 1);
	    s = Reverse(s, k, n - 1);
	    s = Reverse(s, 0, n - 1);
	    return s;
	  }
	  public static void main(String args[]) {
		  Scanner sc=new Scanner(System.in);
	    String s =sc.nextLine();
	    int n = s.length();
	    int k = 2; 
	    String result = Rotateeletoleft(s, n, k);	    
	    System.out.println( result);
	  }
	}
