/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.pandolfo
 */
public class Teste {
    
   public static void main(String[] args) {
       
   if (args.length == 2) {
       System.out.println("Argumento[0] = " + args[0]);
       System.out.println("Argumento[1] = " + args[1]);
   }else if (args.length == 1) {
        System.out.println("Argumento[0] = " + args[0]);
   } else {
        System.out.println("Sem argumentos");
   }
   }
}
