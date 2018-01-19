package br.com.lima.springproject.repositories;

import br.com.lima.springproject.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
