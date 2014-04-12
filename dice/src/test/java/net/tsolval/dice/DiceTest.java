package net.tsolval.dice;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author "Walker D. Adams"
 * 
 */
public class DiceTest {
	private final Dice dice = new Dice();

	/**
	 * Test method for {@link net.tsolval.dice.Dice#roll(int)}.
	 */
	@Test
	public void testRollInt() {
		// create storage array to count dice faces and number of rolls
		int[] results = { 0, 0, 0, 0, 0, 0, 0 };

		// loop until all faces come up - minimum of 6 rolls (max 100)
		while (!allfaces(results)) {
			// roll a 6-sided die
			int result = dice.roll(Dice.SIX_SIDED);

			// increment the face result.
			results[result]++;

			// increment roll count in element 0
			results[0]++;
		}
		// there were at least 6 rolls
		Assert.assertTrue(results[0] >= 6);
		// all faces were selected at least once
		Assert.assertTrue(allfaces(results));
	}

	/**
	 * Test method for {@link net.tsolval.dice.Dice#roll(int, int)}.
	 */
	@Test
	public void testRollIntInt() {
		// roll 3D6 and capture results.
		int[] results = dice.roll(3, Dice.SIX_SIDED);

		// results array was returned
		Assert.assertNotNull(results);
		// results array is 3 elements in size
		Assert.assertTrue(results.length == 3);
		// each result is between 1 and 6
		for (int result : results) {
			Assert.assertTrue(result >= 1 && result <= 6);
		}

	}

	/**
	 * Test method for {@link net.tsolval.dice.Dice#sum(int[])}.
	 */
	@Test
	public void testSum() {
		for (int i = 0; i < 50; i++) {
			int result = dice.sum(dice.roll(3, Dice.SIX_SIDED));

			// result is between 3 and 18
			Assert.assertTrue(result >= 3 && result <= 18);
		}
	}

	/**
	 * @param results
	 *            - array representing rolls of dice.
	 * @return true if all faces represented, false otherwise.
	 */
	private static boolean allfaces(int[] results) {
		for (int result : results) {
			if (result == 0) {
				return false;
			}
		}
		return true;
	}
}
