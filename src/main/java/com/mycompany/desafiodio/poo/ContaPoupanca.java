package com.mycompany.desafiodio.poo;

public class ContaPoupanca extends Conta {
    
    
     public ContaPoupanca(Cliente cliente) {

         super(cliente);
    }

    
@Override
    public void imprimeExtrato() {
        System.out.println(" :: Extrato Conta Poupança :: ");
        super.imprimeInfosGerais();
}
}
