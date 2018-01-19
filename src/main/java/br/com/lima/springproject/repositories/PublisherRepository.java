package br.com.lima.springproject.repositories;

import br.com.lima.springproject.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
