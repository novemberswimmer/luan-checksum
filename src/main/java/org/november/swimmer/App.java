package org.november.swimmer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The Luhn Formula:
<ul>Drop the last digit from the number. The last digit is what we want to check against</ul>
<ul>Reverse the numbers</ul>
<ul>Multiply the digits in odd positions (1, 3, 5, etc.) by 2 and subtract 9 to all any result higher than 9</ul>
<ul>Add all the numbers together</ul>
<ul>The check digit (the last number of the card) is the amount that you would need to add to get a multiple of 10 (Modulo 10)<ul>

 * <p>@author novemberswimmer</p>
 *
 */
public class App {

	public static void main(String[] args) {
		ArrayList<Integer> originalNumber15Digit = new ArrayList(Arrays.asList(4,5,5,6,7,3,7,5,8,6,8,9,9,8,5));
		//ArrayList<Integer> tempArray = new ArrayList();
		Integer sumDigit = 0;
		Integer checkDigit =0;
		for (int i = originalNumber15Digit.size() - 1; i >=0; i--) {
			Integer val=0;
			if (i % 2==0) {
				val = originalNumber15Digit.get(i) * 2;
				if (val > 9) {
					val = val - 9;
				}
			} else {
				val = originalNumber15Digit.get(i);
			}
				sumDigit = sumDigit + val;
		}
		
		checkDigit = sumDigit % 10;
		System.out.println("Checksum : " + checkDigit);
		
		originalNumber15Digit.add(checkDigit);
		
		System.out.println(originalNumber15Digit.toString());
	}

}
