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
public class Conta {
    
    private String nome;
    private int conta;
    private Double saldo;
    private Double limite;
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public void saque(Double valor) {
          saldo = saldo-valor;
        }
    
     public void deposito (Double valor) {
          saldo = saldo+valor;
   }
     
     public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
    
   public String toString() {
       
       return 
       "***************************\n" +   
       "Conta: " + conta + "\n" +
       "Nome: " + nome + "\n" +
       "Saldo: " + saldo + "\n" +      
       "Limite : " + limite + "\n";      
   }

 
}
