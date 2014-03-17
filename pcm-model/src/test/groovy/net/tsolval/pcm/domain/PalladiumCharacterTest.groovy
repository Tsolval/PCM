package net.tsolval.pcm.domain

import static org.junit.Assert.*
import net.tsolval.dice.Dice

import org.junit.Test

/**
 * Test the PalladiumCharacter model object.
 * @author tsolval
 */
class PalladiumCharacterTest {
	PalladiumCharacter character = new PalladiumCharacter()

	@Test
	void testAttributes() {
		character.fullName="Pyka Treegate"
		character.shortName="Pyka"
		Dice dice = new Dice()

		// store character attributes
		character.attributes[PalladiumAttribute.IQ]=new PalladiumValue(dice.roll(3, Dice.SIX_SIDED))
		character.attributes[PalladiumAttribute.MA]=new PalladiumValue(dice.roll(3, Dice.SIX_SIDED))
		character.attributes[PalladiumAttribute.ME]=new PalladiumValue(dice.roll(3, Dice.SIX_SIDED))
		character.attributes[PalladiumAttribute.PS]=new PalladiumValue(dice.roll(3, Dice.SIX_SIDED))
		character.attributes[PalladiumAttribute.PE]=new PalladiumValue(dice.roll(3, Dice.SIX_SIDED))
		character.attributes[PalladiumAttribute.PB]=new PalladiumValue(dice.roll(3, Dice.SIX_SIDED))
		character.attributes[PalladiumAttribute.PP]=new PalladiumValue(dice.roll(3, Dice.SIX_SIDED))
		character.attributes[PalladiumAttribute.SPD]=new PalladiumValue(dice.roll(3, Dice.SIX_SIDED))

		// retrieve character attributes
		int iq = character.attributes[PalladiumAttribute.IQ].value
		int ma = character.attributes[PalladiumAttribute.MA].value
		int me = character.attributes[PalladiumAttribute.ME].value
		int ps = character.attributes[PalladiumAttribute.PS].value
		int pp = character.attributes[PalladiumAttribute.PP].value
		int pe = character.attributes[PalladiumAttribute.PE].value
		int pb = character.attributes[PalladiumAttribute.PB].value
		int spd = character.attributes[PalladiumAttribute.SPD].value

		// retrieve character attributes
		assertNotNull("IQ is null", iq)
		assertTrue("IQ is not a valid number", 3 < iq && iq < 18)
		assertNotNull("MA is null", ma)
		assertTrue("MA is not a valid number", 3 < ma && ma < 18)
		assertNotNull("ME is null", me)
		assertTrue("MA is not a valid number", 3 < me && me < 18)
		assertNotNull("PS is null", ps)
		assertTrue("PS is not a valid number", 3 < ps && ps < 18)
		assertNotNull("PE is null", pe)
		assertTrue("PE is not a valid number", 3 < pe && pe < 18)
		assertNotNull("PB is null", pb)
		assertTrue("PB is not a valid number", 3 < pb && pb < 18)
		assertNotNull("PP is null", pp)
		assertTrue("PP is not a valid number", 3 < pp && pp < 18)
		assertNotNull("SPD is null", spd)
		assertTrue("SPD is not a valid number", 3 < spd && spd < 18)
	}

	@Test void testStats(){
		
	}
}
