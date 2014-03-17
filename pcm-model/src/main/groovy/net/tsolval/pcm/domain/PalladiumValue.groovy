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
	int[] baseValue
	int[] bonusValue

	PalladiumValue(int ... baseValues) {
		setBaseValue(baseValues)
	}

	int getValue() {
		int sum = 0
		for(int i : ArrayUtils.addAll(baseValue, bonusValue)) {
			sum += i
		}
		sum
	}
}
