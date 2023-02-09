package com.cogent;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthorService 
{
	@Autowired
	AuthorRepoInterface interf;
	
	// Retrieve one Author
	public Optional<Author> get(int authorId) { return interf.findById(authorId); }
	
	// Retrieve everything
	public List<Author> getAll() { return (List<Author>) interf.findAll(); }
	
	// Update/Create Author
	public Author update(Author auth) { return interf.save(auth); }
	
	// Delete Author
	public void delete(Author auth) { interf.delete(auth); }
	
	// Delete Everything
	public void deleteAll() { interf.deleteAll(); }
}