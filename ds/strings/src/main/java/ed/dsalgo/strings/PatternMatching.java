package ed.dsalgo.strings;

import java.lang.String;

public interface PatternMatching{
    int matchPattern(String str, String pattern);
}

class KPM_PatterMatcher implements PatternMatching {
    public int matchPattern(String str, String pattern){
	String lpsStr = pattern + "#" + str;//assuming that nither the string nor the pattern contain the special char '#'
	int patternLen = pattern.length();
	int[] pi = new int[lpsStr.length()];
	pi[0] = 0;
	int l = 0; // length of the lps matched at a particular position
	for(int i = 1; i< lpsStr.length();i++){

	    l = pi[i-1];
	    while(l>0 && lpsStr.charAt(i)!=lpsStr.charAt(l))
		l = pi[l-1];
	    if(lpsStr.charAt(i) == lpsStr.charAt(l))l++;
	    pi[i] = l;
	    if(l == patternLen)
		return i;
	    for(int ai: pi)
	    	System.out.print(" "+ai+ " ");
	    System.out.println("");
	}
	return 0;
    }
    
}
