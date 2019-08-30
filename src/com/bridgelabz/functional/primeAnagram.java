package com.bridgelabz.functional;

import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class primeAnagram {

		public static void main(String[] args) {
			System.out.println("prime and anagrams");
		
		
	        primeAnagrams();
		}
	
		public static int[] count(int n) {
			int[] count = new int[10];
			int temp = n;
			while (temp != 0) {
				int r = temp % 10;
				count[r]++;
				temp = temp / 10;
			}
			return count;
		}
		public static boolean anagram(int n1, int n2) {
			int[] n1count = count(n1);
			int[] n2count = count(n2);
			for (int i = 0; i < n2count.length; i++) {
				if (n1count[i] != n2count[i]) {
					return false;
				}
			}
			return true;
		}





public static void primeAnagrams() {
	ArrayList<Integer> ar = new ArrayList<Integer>();
	System.out.println();
	boolean b;
	int i,j;
	for ( j = 2; j <= 100; j++) {
		b = true;
		for ( i = 2; i < j / 2; i++) {
			if (j % i == 0) {
				b = false;
				break;
			}
		}
		if (b)
			ar.add(j);
	}
	for ( i = 0; i < ar.size(); i++) {
		for (j = i + 1; j < ar.size(); j++) {
			if (anagram(ar.get(i), ar.get(j))) {
				System.out.println(ar.get(i) + "  " + ar.get(j));
			}
		}
	}

}
}






