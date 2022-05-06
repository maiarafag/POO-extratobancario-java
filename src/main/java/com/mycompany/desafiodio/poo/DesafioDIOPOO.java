package com.mycompany.desafiodio.poo;

public class DesafioDIOPOO {

    public static void main(String[] args) {
        
        Cliente maiara = new Cliente();
        maiara.setNome("Maiara");
        
        
        Conta cc = new ContaCorrente(maiara);
        Conta cp = new ContaPoupanca(maiara);

        
        cc.deposito(300);
        cc.transferencia(100, cp);
        cc.pagamento(35);
        cc.RecargadeCelular(20);
        cc.emprestimos(500);

        
        cc.imprimeExtrato();
        cp.imprimeExtrato();
        
    }
}
