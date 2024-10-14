package br.sesi.bank.bank_java_dbc.exceptions;

public class RegraDeNegocioException extends RuntimeException{
    public RegraDeNegocioException(String mensagem){
        super(mensagem);
    }
}
