package ed.dsalgo.strings;

import java.lang.System.*;
import java.util.ArrayList;
import java.util.Scanner;
import ed.dsalgo.strings.*;
import static java.lang.System.out;

public class App {
    static ArrayList<String> MainMenu = new ArrayList<String>();
    public static void main(String[] args) {
	MainMenu.add("PatternMatching: KPM_PatterMatcher");
	MainMenu.add("PatternMatching: RabinKarp_PatterMatcher");
	MainMenu.add("Longest Palindromic Substring");
	Scanner sc = new Scanner(System.in);
	int count = 0;
	System.out.println("Menu: ");
	for(String s: MainMenu){
	    out.print(++count + ". ");
	    out.println(s);
	}
	System.out.println("Enter the your Choice: ");
	int choice = sc.nextInt();
	String inStr = null;
	switch(choice){
	case 1:
	    out.println("Enter String :");
	    String pmString = sc.next();
	    sc.nextLine();
	    out.println("Enter Pattern :");
	    String pmPattern = sc.nextLine();
	    PatternMatching pm = new KPM_PatternMatcher();
	    int idx = pm.matchPattern(pmString, pmPattern);
	    out.println("Pattern Matching Result: "+idx);
	    break;
	case 2:
	    out.println("Enter String :");
	    String rkString = sc.next();
	    sc.nextLine();
	    out.println("Enter Pattern :");
	    String pattern = sc.nextLine();
	    PatternMatching rkpm = new RabinKarp_PatternMatcher();
	    out.println("Pattern Matching Result: "+rkpm.matchPattern(rkString, pattern));
	    break;

	case 3:
	    out.println("Enter String :");
	    inStr = sc.next();
	    sc.nextLine();
	    Solutions s = new Solutions();
	    out.println("Longest Palindromic Substring: "+s.getLongestPalindromeStr(inStr));
	    break;

	default:
	    out.println("Invalid Choice");
	    break;
	}


    }

}

