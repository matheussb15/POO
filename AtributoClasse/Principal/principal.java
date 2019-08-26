/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Teclado.teclado;

public class principal {
      public  static  void  main ( String [] args ) {
        teclado tc1 =  new  teclado();
        teclado tc2 =  new  teclado();
        
            tc1.cor = " preto " ;
            tc1.numeracao = " 258.697.234.358 " ;
            tc1.modelo = " KNJ-1577 " ;
            tc1.preco = " 40,00 " ;
            
            
            tc2.cor = " Rgb " ;
            tc2.numeracao = " 253.459.964.841 " ;
            tc2.modelo = " KNJ-1588 " ;
            tc2.preco = " 100,00 " ;
            
            
            System.out.println (tc1.cor + "\n" + tc1.numeracao + "\n " + tc1.modelo + "\n " + tc1.preco + "\n ");
            
            System.out.println (tc2.cor + "\n" + tc2.numeracao +"\n" + tc2.modelo + "\n" + tc2.preco + "\n");
      }
}
