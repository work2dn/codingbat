package com.logic_2;
/**
 * 
 * We want to make a row of bricks that is goal inches long. 
 * We have a number of small bricks (1 inch each) and big bricks (5 inches each). 
 * Return true if it is possible to make the goal by choosing from the given bricks. 
 * This is a little harder than it looks and can be done without any loops. 
 * 
 * See also: Introduction to MakeBricks


makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true

 * 
 * @author rdarshan
 *
 */
public class Medium_MakeBricks {

	public static void main(String[] args) {

		int small = 6, big = 1, goal = 11;
//		System.out.println(7 % 5); // 2
//		System.out.println(2 % 5); // 2
		
		System.out.println(makeBricks(small, big, goal));
		System.out.println(makeBricksOther(small, big, goal));
		
	}

	private static boolean makeBricksOther(int small, int big, int goal) {

		if(goal > (big*5 + small) ) { //Not enough total
			
			return false;
			
		} else {
			
			return goal % 5 <= small; //Check if there are enough small bricks
			
		}
		
	}

	private static boolean makeBricks(int small, int big, int goal) {
		
		int bigN = goal/5;
		int smallN = goal % 5;
		
		if(bigN <= big && smallN <= small) {
			
			return true;
			
		} else if(big * 5 < goal && small >= (goal - big * 5)) {
			
			return true;
			
		}
		
		return false;
		
	}

}
