package com.derpy.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DERP_COMMENT")
public class Comment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -646283450452117072L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "commentSequence")
	@SequenceGenerator(allocationSize = 1, name = "commentSequence", sequenceName = "SQ_COMMENT_PK")
	@Column(name = "COMMMENT_ID")
	private int id;
	
	@Column(name = "COMMENT_BODY")
	private String body;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="USER_ID")
	private User user;

	public Comment(int id, String body, User user) {
		super();
		this.id = id;
		this.body = body;
		this.user = user;
	}

	public Comment(String body, User user) {
		super();
		this.body = body;
		this.user = user;
	}

	public Comment() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", body=" + body + ", user=" + user + "]";
	}
	
	

}
