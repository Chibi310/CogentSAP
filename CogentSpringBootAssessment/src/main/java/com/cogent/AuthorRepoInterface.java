package com.cogent;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface AuthorRepoInterface extends CrudRepository<Author, Integer> { }