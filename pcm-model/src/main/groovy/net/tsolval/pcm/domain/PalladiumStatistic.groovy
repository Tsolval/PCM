package net.tsolval.pcm.domain

/**
 * Enumerate the various PalladiumStatistic types.
 * @author tsolval
 *
 */
public enum PalladiumStatistic {
	HP("H.P.", "Hit Points", "A measure of how much physical damage a character can take before she dies."),
	SDC("S.D.C.", "Structural Damage Capacity", "A measure of how much physical damage a body can take before it begins to suffer hp damage."),
	MDC("M.D.C.", "Mega-Damage Capacity", "A measure of how much mega-damage a character can take.  Usually not much...")

	private final String label
	private final String name
	private final String description

	private PalladiumStatistic(String label, String name, String description) {
		this.label=label
		this.name=name
		this.description=description
	}

	String getName(){ name }
	String getLabel(){ label }
	String getDescription() { description }
}
