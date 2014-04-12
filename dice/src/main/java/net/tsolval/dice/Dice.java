package net.tsolval.dice;

import java.util.Random;

/**
 * Random number generator which simulates rolling of a die
 * 
 * @author "Walker D. Adams"
 */
/**
 * @author "Walker D. Adams"
 * 
 */
public class Dice {
	public static final int TWO_SIDED = 2;
	public static final int FOUR_SIDED = 4;
	public static final int SIX_SIDED = 6;
	public static final int EIGHT_SIDED = 8;
	public static final int TEN_SIDED = 10;
	public static final int TWELVE_SIDED = 12;
	public static final int TWENTY_SIDED = 20;
	public static final int HUNDRED_SIDED = 100;

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.tsolval.dice.DiceBag#roll(int)
	 */
	public int roll(int sides) {
		return new Random().nextInt(sides) + 1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.tsolval.dice.DiceBag#roll(int, int)
	 */
	public int[] roll(int number, int sides) {
		int[] results = new int[number];
		for (int i = 0; i < number; i++) {
			results[i] = roll(sides);
		}
		return results;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.tsolval.dice.DiceBag#sum(int[])
	 */
	public int sum(int... results) {
		int sum = 0;
		for (int result : results) {
			sum += result;
		}
		return sum;
	}
}
