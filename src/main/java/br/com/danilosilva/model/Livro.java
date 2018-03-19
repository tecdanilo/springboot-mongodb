package br.com.danilosilva.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by danilo on 10/08/2017.
 */
@Document
public class Livro {

    @Id
    private Long id;
    private String nome;
    private String editora;

    private List<Exemplar> exemplares;

    public Livro() {
    }

    public Livro(Long id, String nome, String editora) {
        this.id = id;
        this.nome = nome;
        this.editora = editora;
    }

    public Livro(Long id, String nome, String editora, List<Exemplar> exemplares) {
        this.id = id;
        this.nome = nome;
        this.editora = editora;
        this.exemplares = exemplares;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public List<Exemplar> getExemplares() {
        return exemplares;
    }

    public void setExemplares(List<Exemplar> exemplares) {
        this.exemplares = exemplares;
    }
}
