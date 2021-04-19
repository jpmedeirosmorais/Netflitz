package com.company.models.midia;

import com.company.models.Midia;

public class Serie extends Midia {

    public Serie(String titulo) {
        super(titulo);
    }

    @Override
    public void statusMidia() {
        System.out.println("");
        System.out.println("--------------------------");
        System.out.println("Titulo da série: " + this.getTitulo());
        System.out.println("--------------------------");
        System.out.println("");
    }
}
