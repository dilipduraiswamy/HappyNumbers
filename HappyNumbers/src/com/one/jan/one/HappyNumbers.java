/**
 * 
 */
package com.one.jan.one;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author dilip.duraiswamy
 *
 */
public class HappyNumbers {

	/**
	 * @param limitTo
	 * @return sorted set of happy numbers
	 * @Example if limitTo is 10 it will return 1 7 10 13 19 23 28 31 32 44
	 */
	public static TreeSet<Long> generateHappyNumbers(int limitTo) {
		HashSet<Long> happyNumbers = new HashSet<>();
		for (long num = 1, count = 0; count < limitTo; num++) {
			if (is_happy_num(num)) {

				happyNumbers.add(num);
				count++;
			}
		}
		TreeSet<Long> happyNumbersTreeSet = new TreeSet<Long>();
		happyNumbersTreeSet.addAll(happyNumbers);
		return happyNumbersTreeSet;
	}

	/**
	 * @param num
	 * @return true/false
	 */
	public static boolean is_happy_num(long num) {
		long m = 0;
		int digit = 0;
		HashSet<Long> cycle = new HashSet<Long>();
		while (num != 1 && cycle.add(num)) {
			m = 0;
			while (num > 0) {
				digit = (int) (num % 10);
				m += digit * digit;
				num /= 10;
			}
			num = m;
		}
		return num == 1;
	}

}
