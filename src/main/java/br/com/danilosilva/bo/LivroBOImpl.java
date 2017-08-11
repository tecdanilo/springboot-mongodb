package br.com.danilosilva.bo;

import br.com.danilosilva.model.Livro;
import br.com.danilosilva.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by danilo on 10/08/2017.
 */
@Service
public class LivroBOImpl implements LivroBO {

    @Autowired
    LivroRepository livroRepo;

    @Override
    public List<Livro> findAll(){
        return livroRepo.findAll();
    }
    @Override
    public void save(Livro livro){
        livroRepo.save(livro);
    }

}
