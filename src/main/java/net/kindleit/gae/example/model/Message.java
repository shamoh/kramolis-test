package net.kindleit.gae.example.model;

import javax.jdo.annotations.*;
import java.io.Serializable;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Message implements Serializable {

	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;

	@Persistent
	private String text;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
