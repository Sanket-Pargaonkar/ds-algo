package  ed.dsalgo.stacks

/**
 *@author Sanket Pargaonkar
 *@version 1.0
 *@since 07-12-2020
 */;

import static java.lang.System.out;

public class PatternMatcher132{

    private final int[] input;

    public PatternMatcher132(){
	this.input = null;
    }

    public PatternMatcher132(int... input){
	this.input = input;
    }

    /**
     * This is the O(n^2)implementation of the solution
     */
    public int[] Get132Pattern1(){
	int[] result = new int[3];
	boolean patternFound = false;	
	for(int i : input){
	    int ele = i;
	    result[0] = ele;
	    boolean secondStep = false;	    
	    for(int j : input){
		if(!secondStep && ele < j){
		    result[2] = j;
		    secondStep = true;
		    continue;
		}else if(secondStep &&  (result[0]<j && j> result[2])){
		    result[1] = j;
		    patternFound = true;
		    break;
		}
	    }
	    if(patternFound)break;
	}
	return patternFound?result:null;
    }
    
}
