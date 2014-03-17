package net.tsolval.pcm.domain

import java.security.PublicKey

import com.sun.org.apache.bcel.internal.generic.RETURN

import sun.tools.tree.ThisExpression

/**
 * Enumerate the various PalladiumAttribute types.
 * @author tsolval
 *
 */
enum PalladiumAttribute {
	IQ("I.Q.", "Intelligence Quotient",  "Indicates a character's intelligence."),
	ME("M.E.", "Mental Endurance", "Measures the amount of mental and emotional stress the character can withstand."),
	MA("M.A.", "Mental Affinity", "Represents the character's likability, personal charm and charisma."),
	PS("P.S.", "Physical Strength", "This is the raw physical power of a character."),
	PP("P.P.", "Physical Prowess", "Shows the degree of dexterity and agility of the character."),
	PE("P.E.", "Physical Endurance", "Demonstrates the character's stamina and durability."),
	PB("P.B.", "Physical Beauty","An indication of the physical attractiveness of the character."),
	SPD("Spd.", "Speed", "This is how fast the character can run.")
	private final String label
	private final String name
	private final String description

	private PalladiumAttribute(String label, String name, String description) {
		this.label=label
		this.name=name
		this.description=description
	}

	String getName(){ name }
	String getLabel(){ label }
	String getDescription() { description }
}
