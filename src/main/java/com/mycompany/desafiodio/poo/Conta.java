package com.mycompany.desafiodio.poo;

public abstract class Conta implements MaConta {
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
   

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
        this.cliente = cliente;
    }
    

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {

        return numero;
    }

    public double getSaldo() {

        return saldo;
    }

    /*public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    public void saque(){
    }


    public void deposito(){
    }

    public void transferencia(){
    }

    public void pagamento(){
    }

    public void emprestimos(){
    }

    public void RecargadeCelular(){
    }*/
    
    
    @Override
    public void saque(double valor) {
        saldo -= valor;
        
    }
    @Override
    public void deposito(double valor) {
        saldo += valor;
    }

    @Override
    public void transferencia(double valor, MaConta contaDestino) {
        this.saque(valor);
        contaDestino.deposito(valor);
    }

    @Override
    public void pagamento(double valor) {
        saldo -= valor;
    }

    @Override
    public void emprestimos(double valor) {
        saldo += valor;
    }

    @Override
    public void RecargadeCelular(double valor) {
        saldo -= valor;
    }
        protected void imprimeInfosGerais() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public void imprimeExtrato() {
        
    }
}


