package com.cogent;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "author")
public class Author implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int authorId;
	private String authorName, authorAddress;
	private long authorPhone;
	
	public Author() { super(); }

	public Author(int authorId, String authorName, String authorAddress, int authorPhone) 
	{
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.authorAddress = authorAddress;
		this.authorPhone = authorPhone;
	}

	public int getAuthorId() { return authorId;	}

	public void setAuthorId(int authorId) { this.authorId = authorId; }

	public String getAuthorName() { return authorName; }

	public void setAuthorName(String authorName) { this.authorName = authorName; }

	public String getAuthorAddress() { return authorAddress; }

	public void setAuthorAddress(String authorAddress) { this.authorAddress = authorAddress; }

	public long getAuthorPhone() { return authorPhone; }

	public void setAuthorPhone(int authorPhone) { this.authorPhone = authorPhone; }
	
}