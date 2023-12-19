package br.infnet.com.venda.exception;

public class VacinaNotFoundException extends RuntimeException {
    public VacinaNotFoundException(){

    }

    public VacinaNotFoundException(String message){
        super(message);
    }
}
