package br.sesi.bank.bank_java_dbc.controller;

import br.sesi.bank.bank_java_dbc.domain.cliente.DadosCadastroCliente;
import br.sesi.bank.bank_java_dbc.service.ContaService;

import java.sql.SQLException;
import java.util.Scanner;

public class BankJavaController {
    public ContaService service;
    public Scanner teclado;

    public BankJavaController(){
        this.service = new ContaService();
        this.teclado = new Scanner(System.in).useDelimiter("\n");
    }
    public static void main(String[] args) throws SQLException {
        BankJavaController controller = new BankJavaController();
        controller.start();
    }
    public void start() throws SQLException{
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");

        var opcao = exibirMenu();
        while (opcao != 8){
            try{

            }
        }
    }
    public void exibirMenu(){

    }
    public void listarContas(){

    }
    public void abrirConta(){

    }
    public void encerrarConta(){

    }
    public void consultarSaldo(){

    }
    public void realizarSaque(){

    }
    public void realizarDeposito(){

    }
    public void realizarTranseferencia(){

    }

}
