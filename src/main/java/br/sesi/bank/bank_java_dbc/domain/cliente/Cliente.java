package br.sesi.bank.bank_java_dbc.domain.cliente;

public class Cliente {
    private String nome;
    private String email;
    private String cpf;

    public Cliente(DadosCadastroCliente dados){
        this.nome = dados.nome;
        this.email = dados.email;
        this.cpf = dados.cpf;
    }

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getemail(){
        return email;
    }
    /*
    public Boolean equals(Object 0){

    }
    public int hashCode(){

    }
     */
}
