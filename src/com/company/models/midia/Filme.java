package com.company.models.midia;
import com.company.models.Midia;

public class Filme extends Midia {

    public Filme(String titulo) {
        super(titulo);
    }

    @Override
    public void statusMidia() {
        System.out.println("");
        System.out.println("--------------------------");
        System.out.println("Titulo do filme: " + this.getTitulo());
        System.out.println("--------------------------");
        System.out.println("");
    }
}
