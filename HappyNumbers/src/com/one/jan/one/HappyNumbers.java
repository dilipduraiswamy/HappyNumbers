/**
 * 
 */
package com.one.jan.one;

import java.util.HashSet;

/**
 * @author dilip.duraiswamy
 *
 */
public class HappyNumbers {

	/**
	 * @param num
	 * @return true/false
	 */
	public static boolean happy_num(long num){
	       long m = 0;
	       int digit = 0;
	       HashSet<Long> cycle = new HashSet<Long>();
		   while(num != 1 && cycle.add(num)){
	           m = 0;
	           while(num > 0){
	               digit = (int)(num % 10);
	               m += digit*digit;
	               num /= 10;
	           }
	           num = m;
	       }
	       return num == 1;
	   }   
	

}
