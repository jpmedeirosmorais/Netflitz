package com.company.models.exceptions;

public class CartaoVencido extends Exception{
    public CartaoVencido() {
        super("Cartão vencido! Utilize outro cartão para efetuar o pagamento.");
    }
}
