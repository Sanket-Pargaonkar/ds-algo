package ed.randomQtns;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Collections;

/**
 *@author Sanket Pargaonkar
 *@since <2020-11-22 Sun 17:32>
 *
 * Question:The input will be a sting of random numbersnot startingwith , the code must output the largest twodigit combination from the given string
 * example : "24122423" -> 44
 */

public class Qtn1{
    public void  Solution(String input){
	char[] carr = input.toCharArray();
	char[] temp = new char[carr.length];
	ArrayList<String> list = new ArrayList();
	ArrayList<Integer> intList = new ArrayList<Integer>();
	for(char c : carr){
	    temp = new char[carr.length];
	    ///copying the remainder of carr
	    for(int i = 0; i<temp.length; i++){
		if(carr[i] == c) continue;
		temp[i] = carr[i];
	    }

	    for(char m : temp){
		if(m == 0)continue;
		String twoDigitNum = String.valueOf(c) + m;
		if(!list.contains(twoDigitNum))
		list.add(twoDigitNum);
	    }
	}
	for(String s: list){
	    intList.add(Integer.valueOf(s));
	}

	Collections.sort(intList, Collections.reverseOrder());
	out.println(String.valueOf(intList.get(0)));	    
	
    }
}

