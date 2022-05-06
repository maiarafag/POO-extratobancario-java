package com.mycompany.desafiodio.poo;

public interface MaConta {
    
    void saque(double valor);
    
    void deposito(double valor);
    
    void transferencia(double valor, MaConta contaDestino);
    
    void pagamento(double valor);
    
    void emprestimos(double valor);
    
    void RecargadeCelular(double valor);
    
    void imprimeExtrato();

    
    
}