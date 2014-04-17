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
	List<Integer> base = [0]
	Map<String, Integer> bonusMap = [nullproof:0]
	Map<String, Integer> penaltyMap = [nullproof:0]

	PalladiumValue(int... baseValues) {
		setBase(baseValues.toList())
	}

	PalladiumValue(String bonusReason, int bonusValue) {
		bonusMap << [bonusReason:bonusValue]
	}

	def addBonus(String bonusReason, Integer bonus) {
		bonusMap << [(bonusReason):(bonus)]
	}

	def addPenalty(String penaltyReason, Integer penalty){
		penaltyMap << [(penaltyReason):(penalty)]
	}

	/** Calculates the integer value by adding the base numbers to the bonus numbers and subtracting penalty numbers. */
	int getValue() {
		base.sum()+bonusMap.values().sum()-penaltyMap.values().sum()
	}
}
