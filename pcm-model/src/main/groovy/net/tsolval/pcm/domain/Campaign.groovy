package net.tsolval.pcm.domain

import javax.persistence.Entity
import javax.persistence.Id

/**
 * Entity representing a campaign in the game.
 * 
 * @author tsolval
 *
 */
@Entity
class Campaign {
	@Id Long id
	String name

	Set<Character> characters
}
