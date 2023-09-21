package ed.dsalgo.strings;

import java.lang.String;
import java.lang.Math;

public interface PatternMatching{
    int matchPattern(String str, String pattern);
}

class KPM_PatternMatcher implements PatternMatching {
    public int matchPattern(String str, String pattern){
	str = str.toLowerCase();
	pattern = pattern.toLowerCase();
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


class RabinKarp_PatternMatcher implements PatternMatching{
    public int matchPattern(String str, String pattern){
	int pL = pattern.length();
	int patternWt = getStrWeight(pattern);
	int rollingWt =  getStrWeight(str.substring(0, pL));
	if(rollingWt == patternWt) return 0;
	for(int i = 1; i< str.length() - pL  ; i= i+1){
	    rollingWt = (rollingWt - getCharWt(str.charAt(i-1),pL-1));//*10 + getCharWt(str.charAt(i+pL),0);
	    rollingWt *= 10;
	    rollingWt = rollingWt + getCharWt(str.charAt(i+pL-1),0); 
	    if(rollingWt == patternWt)
		return i;
	}
	return 0;
	
    }
    
    private int getStrWeight(String str){
	int wt = 0;
	int strLen = str.length();
	for(int i = strLen-1  ; i >= 0 ; i--){
	    wt += getCharWt(str.charAt(i), i);
	}
	return wt;
    }

    private int getCharWt(char c, int pow){
	return	(int)(c- 'a'+1)*(int)Math.pow(10, pow);
    }
}

