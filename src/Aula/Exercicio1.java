package Aula;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.pandolfo
 */
public class Exercicio1 {

    
public static void main(String[] args) {
    
    System.out.println("Abertura de Contas");
    
    Conta c1 = new Conta();
    c1.setConta(1);
    c1.setNome("Lucas");
    c1.setSaldo(201.00);
    c1.setLimite(200.00);

    Conta c2 = new Conta();
    c2.setConta(2);
    c2.setNome("João");
    c2.setSaldo(45000.00);
    c2.setLimite(1000.00);
    
    System.out.println(c1.toString());
    System.out.println(c2.toString());
    
    System.out.println("Transf. R$200 de João para Lucas\n");
    System.out.println("Processando...\n");
    Double vTrans = 200d;
    
    if ((c1.getSaldo() < c1.getLimite()) || (c2.getSaldo() < c2.getLimite())) {
        System.out.println("Valor do limite não pode ser maior que o saldo atual da conta!");
        return; 
}
    
            if ((c2.getLimite() < vTrans) || (c1.getLimite()) < vTrans) {
                System.out.println("Valor do limite excedido!");
                return;
            } else {
                
            Transferencia(200d, c2, c1);
            System.out.println("Transferência concluída com sucesso!");

    System.out.println(c1.toString());
    System.out.println(c2.toString());
    }
}       

    private static void Transferencia(double valor, Conta origem, Conta destino) {
     try {
         
     origem.saque(valor);
     destino.deposito(valor);
     
     } catch (Exception e) {
         System.out.println("ERRO" + e.getMessage());
     }
     
       
}
}
