package net.tsolval.pcm.domain

import java.awt.TexturePaintContext.Int

import org.apache.commons.lang3.ArrayUtils
import org.codehaus.groovy.runtime.ArrayUtil

/**
 * Represents a value in a Palladium statistic.  This object maintains the original dice rolls that 
 * resulted in the creation of this value.
 *   
 * @author tsolval
 */
class PalladiumValue {
	int[] base
	int[] bonus
	int[] penalty

	PalladiumValue(int ... baseValues) {
		setBase(baseValues)
	}

	/** Calculates the integer value by adding the base numbers to the bonus numbers and subtracting penalty numbers.  */
	int getValue() {
		int sum = 0
		for(int i : ArrayUtils.addAll(base, bonus)) {
			sum += i
		}
		for (int i: penalty) {
			sum -= i
		}
		sum
	}
}
