package br.sesi.bank.bank_java_dbc.domain.conta;

import br.sesi.bank.bank_java_dbc.domain.cliente.Cliente;

import java.math.BigDecimal;

public class Conta {
    private Integer numero;
    private BigDecimal valor;
    private Cliente titular;

    public Conta(Integer numero, BigDecimal saldo, Cliente titular){
        this.numero = numero;
        this.valor = valor;
        this.titular = titular;
    }
    public boolean possuiSaldo(){
        return true;
    }
    public void sacar(BigDecimal valor){

    }
    public void depositar(BigDecimal valor){

    }
    public Integer getNumero(){
        return numero;
    }
    /*public BigDecimal getSaldo(){
        return saldo;
    }*/
    public Cliente getTitular(){
        return titular;
    }

}
