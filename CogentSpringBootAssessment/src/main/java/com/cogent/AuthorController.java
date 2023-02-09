package com.cogent;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/api")
public class AuthorController 
{
	@Autowired
	AuthorService auths;
	
	// Get all authors
	@GetMapping(value = {"/Author"}) public List<Author> getAll()
	{
		List<Author> authors = auths.getAll();
		System.out.println("[" + authors.size() + "] Retrieved...");
		return authors;
	}
	
	// Get single author
	@GetMapping(value = {"/Author/{id}"}) public Author get(@PathVariable("id") Integer id)
	{
		Optional<Author> auth = auths.get(id);
		return auth.get();
	}
	
	// Add an author
	@PostMapping(value = {"/Author"}) public Author add(@RequestBody Author auth) { return auths.update(auth); }
	
	// Update an author
	@PutMapping(value = {"/Author"}) public Author edit(@RequestBody Author auth) { return auths.update(auth); }
	
	// Delete an author
	public String delete(@RequestParam(value="id") Integer id)
	{
		Optional<Author> auth = auths.get(id);
		auths.delete(auth.get());
		return "[" + id + "] has been deleted...";
	}
}