/**
 * 
 */
package com.catmash.model;

/**
 * @author mjedli
 *
 */
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * CAT MODEL
 * @author mjedli
 *
 */
@Entity
@Table(name="cat")
public class Cat implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Id of cat
	 */
	@Id
	@NotEmpty
	@NotNull
	@Column(name = "ID", unique=true, nullable = false)
	private String id;
	
	/**
	 * url ofthe cat's picture
	 */
	@NotEmpty
	@NotNull
	@Column(name = "URL", nullable = false)
	private String url;
	
	/**
	 * the score of the cat
	 */
	@Column(name = "SCORE", nullable = false)
	private Integer score;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
}
