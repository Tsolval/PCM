package net.tsolval.pcm.domain

/**
 * Entity representing a Character in a Palladium TableTop Role Playing Game such as Heroes Unlimited
 * or Rifts.
 * @author tsolval
 */
class PalladiumCharacter {
	String shortName
	String fullName
	Map<String, PalladiumValue> stats = new HashMap<String, PalladiumValue>()
	Map<PalladiumAttribute, PalladiumValue>	attributes = new HashMap<PalladiumAttribute, PalladiumValue>()
	String toString() {
		String.format("PalladiumCharacter [nickname=%s, full name=%s]\n", shortName, fullName)
	}
}
