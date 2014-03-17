package net.tsolval.pcm.domain

import javax.persistence.Entity
import javax.persistence.Id

/**
 * Represents a Player Entity.  A Player can own characters and can become a game master and run one or more campaign.
 * @author tsolval
 */
@Entity
class Player {
	@Id UUID id
	String firstName
	String lastName
	Set<PalladiumCharacter> characters
	Set<Campaign> campaigns
}
