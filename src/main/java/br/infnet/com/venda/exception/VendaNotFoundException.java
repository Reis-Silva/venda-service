package br.infnet.com.venda.exception;

public class VendaNotFoundException extends RuntimeException {
    public VendaNotFoundException(){

    }

    public VendaNotFoundException(String message){
        super(message);
    }
}
