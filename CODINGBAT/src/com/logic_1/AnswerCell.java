package com.logic_1;
/**
 * Your cell phone rings. 
 * 
 * Return true if you should answer it. 
 * 
 * Normally you answer, except in the morning you only answer if it is your mom 
 * calling. 
 * 
 * In all cases, if you are asleep, you do not answer.

answerCell(false, false, false) → true
answerCell(false, false, true) → false
answerCell(true, false, false) → false

 * 
 * @author rdarshan
 *
 */
public class AnswerCell {

	public static void main(String[] args) {

		boolean isMorning = false, isMom = false, isAsleep = false;
		System.out.println(answerCell(isMorning, isMom, isAsleep));
		System.out.println(answerCellCB(isMorning, isMom, isAsleep));

		
	}

	private static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		
		if(isAsleep) {
			
			return false;
			
		} else if(isMorning && isMom && !isAsleep) {
			
			return true;
			
		} else if (isMorning && !isMom && !isAsleep){
			
			return false;
			
		} else {
			
			return true;
			
		}
		
	}
	
	public static boolean answerCellCB(boolean isMorning, boolean isMom, boolean isAsleep) {
		 
		  if (isAsleep) {
			  
		    return false;
		    
		  }
		  
		  if (isMorning && !isMom) {
			  
		    return false;
		    
		  }
		  
		  return true;
		  
		  // Solution notes: write code to detect each of the false cases.
		  // Deal with one case at a time to keep it simple.
		  // Avoid using == true in tests; use the variables directly as shown here.
		}


}
