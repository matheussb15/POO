/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Objetos.Camisa;
import Objetos.Calca; 

public class principal {
    public static void main(String[] args) {
    Camisa cm1 = new Camisa();
    Camisa cm2 = new Camisa();
    
    Calca c1= new Calca();
    Calca c2 = new Calca();
    
    cm1.cor = "Azul";
    cm1.preco = "30.00";
    cm1.modelo = "FH16";
    cm1.tamanho = "M";
    
    
    cm2.cor = "Vermelho";
    cm2.preco = "30.00";
    cm2.modelo = "Fg46";
    cm2.tamanho = "G";  
    
    System.out.println(cm1.cor+"\n"+cm1.preco+"\n"+cm1.modelo+"\n"+cm1.tamanho+"\n");
     
    System.out.println(cm2.cor+"\n"+cm2.preco+"\n"+cm2.modelo+"\n"+cm2.tamanho+"\n");

    c1.cor="preto";
    c1.preco="60.00";
    c1.modelo="HG54";
    c1.tamanho="GG";
   
    c2.cor = "Azul";
    c2.preco = "60.00";
    c2.modelo = "HG78";
    c2.tamanho = "M";
    
   System.out.println(c1.cor+"\n"+ c1.preco +"\n"+c1.modelo+"\n"+c1.tamanho+"\n");
    
   System.out.println(c2.cor+"\n"+c2.preco +"\n"+c2.modelo+"\n"+c2.tamanho+"\n");
    
    }
}
