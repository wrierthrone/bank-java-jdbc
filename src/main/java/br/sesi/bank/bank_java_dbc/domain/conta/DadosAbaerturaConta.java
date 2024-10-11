package br.sesi.bank.bank_java_dbc.domain.conta;

import br.sesi.bank.bank_java_dbc.domain.cliente.DadosCadastroCliente;

public class DadosAbaerturaConta {
    public Integer numero;
    public DadosCadastroCliente dadosCliente;

    public DadosAbaerturaConta(Integer numero, DadosCadastroCliente dadosCliente){
        this.numero = numero;
        this.dadosCliente = dadosCliente;
    }

}
