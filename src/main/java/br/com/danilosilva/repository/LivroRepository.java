package br.com.danilosilva.repository;

import br.com.danilosilva.model.Livro;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by danilo on 10/08/2017.
 */
public interface LivroRepository extends MongoRepository<Livro,Long> {

}
