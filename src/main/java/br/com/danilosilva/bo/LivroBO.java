package br.com.danilosilva.bo;

import br.com.danilosilva.model.Livro;

import java.util.List;

/**
 * Created by danilo on 10/08/2017.
 */
public interface LivroBO {
    List<Livro> findAll();

    void save(Livro livro);
}
