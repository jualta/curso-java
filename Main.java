
package com.mycompany.mavenproject5;

public class Main
{
public static void main (String args[]) 
{
 Celular celular= new Celular();
 
 celular.marca= "Apple";
 celular.modelo= "Huawei";
 celular.operador= "Movistar";
 celular.serie= 113543;
 
 System.out.println("Marca celular: "+celular.marca);
 System.out.println("Modelo celular: "+celular.modelo); 
 System.out.println("Operador celular: "+celular.operador);   
 System.out.println("Serie celular: "+celular.serie);    
}                      
}
