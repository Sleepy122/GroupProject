package com.derpy.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

public class Vote implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8310257752785425165L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "voteSequence")
	@SequenceGenerator(allocationSize = 1, name = "voteSequence", sequenceName = "SQ_VOTE_PK")
	@Column(name = "VOTE_ID")
	private int id;
	
	@Column(name = "VOTE_VAlUE")
	private int value;
	
	@Column(name = "ANIMAL")
	private String animal;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="USER_ID")
	private User user;

	public Vote(int id, int value, String animal, User user) {
		super();
		this.id = id;
		this.value = value;
		this.animal = animal;
		this.user = user;
	}

	public Vote(int value, String animal, User user) {
		super();
		this.value = value;
		this.animal = animal;
		this.user = user;
	}

	public Vote() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Vote [id=" + id + ", value=" + value + ", animal=" + animal
				+ ", user=" + user + "]";
	}
	
	
}
