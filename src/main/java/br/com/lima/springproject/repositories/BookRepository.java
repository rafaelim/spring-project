package br.com.lima.springproject.repositories;

import br.com.lima.springproject.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
