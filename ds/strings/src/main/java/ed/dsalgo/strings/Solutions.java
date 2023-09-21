package ed.dsalgo.strings;

public class Solutions{
    public String getLongestPalindromeStr_BF(String str){
	String result = null;
	int currLen = 0;
	int[] p = new int[str.length()];	
	for(int i = 0; i < str.length(); i++){
	    for(int j =i; j<=str.length(); j++){
		if(str.charAt(j) != str.charAt(str.length() - 1 - j)) break;
	    }
	    currLen = str.length() -  i;
	    palindromeIdx = i;}
	return result;
    }
}
