package com.bridgelabz.lib;

public class StdRAndom {

	public static void main(String[] args) {
		
		System.out.println("Enter the seed value for reproductive result : ");
		long seed=BLRandom.scanLong();
		System.out.println("Enter number : ");
		int number=BLRandom.scanInt();
		System.out.println("Enter two number : ");
		double lo=BLRandom.scanDouble();
		double hi=BLRandom.scanDouble();
		System.out.println("Enter pobability : ");
		double pobability=BLRandom.scanDouble();
		System.out.println("Enter mean value : ");
		double mean=BLRandom.scanDouble();
		System.out.println("Enter sigma value : ");
		double sigma=BLRandom.scanDouble();
		System.out.println("Enter pobability : ");
		double[] probabilities= {2,3,5,6,8};
		System.out.println("Enter array : ");
		double[] array= {2,3,5,6,8};
		
		
		BLRandom.setSeed(seed);
		BLRandom.uniform(number);
		BLRandom.uniform(lo, hi);
        BLRandom.bernoulli(pobability);
        BLRandom.gaussian();
        BLRandom.gaussian(mean, sigma);
        BLRandom.discrete(probabilities);
        BLRandom.shuffle(array);
	}

}
