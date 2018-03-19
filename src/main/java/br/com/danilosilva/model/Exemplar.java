package br.com.danilosilva.model;

public class Exemplar {

    private String isbn;
    private String obs;

    public Exemplar(String isbn, String obs) {
        this.isbn = isbn;
        this.obs = obs;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
