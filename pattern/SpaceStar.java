package com.pattern;

/*
 *
 *Print below pattern
    *
   **
  ***
 ****
*****

 */

public class SpaceStar {

	public static void main(String[] args) {

		int rows;
		int star;
		int spaces;
		
		for(rows=1;rows<=5;rows++) {
			for(spaces=4 ;spaces >= rows; spaces--) {
				System.out.print(" ");
			}
			
			//Print star, star depends on which row you're. First row, one star and so on
			for(star=1;star <= rows ; star++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		
	}

}
