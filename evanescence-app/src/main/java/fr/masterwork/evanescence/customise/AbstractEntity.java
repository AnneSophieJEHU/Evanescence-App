package fr.masterwork.evanescence.customise;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;



/**
 * @author Anne-sophie JEHU
 * 
 * this class generate an ID.
 *
 */

@SuppressWarnings("serial")
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;

	public AbstractEntity() {
		super();
	}
	
	
	/**
     * @return id
     */
	public Long getId() {
		return id;
	}

	
	
	/**
     * @param id
     */
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
