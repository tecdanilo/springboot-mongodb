package br.com.danilosilva.controller;

import br.com.danilosilva.bo.LivroBO;
import br.com.danilosilva.model.Exemplar;
import br.com.danilosilva.model.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by danilo on 10/08/2017.
 */
@RestController
@RequestMapping("/api")
public class AppController {

    @Autowired
    LivroBO livroBO;

    @RequestMapping("/init")
    public void init(){
        for (int i = 0; i < 10000; i ++){
            List<Exemplar> exemplars = new ArrayList<>();
            exemplars.add(new Exemplar(""+Math.random()+ GregorianCalendar.getInstance().getTimeInMillis(), "xy"+i));
            livroBO.save(new Livro( new Long(i),"Livro "+i, "editora " + (i*Math.random()), exemplars));
        }
    }

    @RequestMapping("/all")
    public List<Livro> listAll(){
        return livroBO.findAll();
    }

    @RequestMapping("/save")
    public String save(@RequestBody Livro livro ){
        try {
            livroBO.save(livro);
            return "OK";
        }catch (Exception e){
            e.printStackTrace();
            return "ERR";
        }
    }
}
