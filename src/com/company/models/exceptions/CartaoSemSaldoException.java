package com.company.models.exceptions;

public class CartaoSemSaldoException extends Exception{
    public CartaoSemSaldoException() {
        super("Cartão sem saldo para cobrar! Troque o cartão.");
    }
}
