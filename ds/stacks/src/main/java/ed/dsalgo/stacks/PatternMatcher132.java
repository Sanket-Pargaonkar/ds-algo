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
    public int[] get132Pattern1(){
	int[] result = new int[3];
	boolean patternFound = false;	
	for(int i : input){
	    int ele = i;
	    result[0] = ele;
	    boolean secondStep = false;	    
	    for(int j : input){
		if(!secondStep && ele < j){
		    result[1] = j;
		    secondStep = true;
		    continue;
		}else if(secondStep &&  (j<result[1])){
		    result[2] = j;
		    patternFound = true;
		    break;
		}
	    }
	    if(patternFound)break;
	}
	return patternFound?result:null;
    }

    /**
     * This is O(n) solution using stacks
     */
    public int[] get132Pattern2(){
	int[] result =  new int[3];
	final MyStack stk = new MyStack();
	for(int i : input)stk.push(i);
	boolean hasPattern = false;
	boolean nextStep = false;
	try{
	    for(int i = 0 ; i< stk.getLength();i++){
		result[0]= ((Integer)stk.pop()).intValue();
		int val = ((Integer)stk.pop()).intValue();
		if(!nextStep && val > result[0]){
		    result[1] =val;
		    nextStep = true;
		    continue;
		}else if(nextStep && val < result[1]){
		    hasPattern = true;
		    result[2] = val;
		    break;
		}

	    }
	}catch(Exception e){
	    e.printStackTrace();
	}
	return hasPattern?result:null;

    }
    
}
