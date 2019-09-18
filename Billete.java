
package com.mycompany.mavenproject5;


public class Billete 
{
 int monto;
 String personaje;
 String banco;
 int serie;
    
 public Billete(int mon ,String perso,String ban)
 {
     monto = mon;
     personaje = perso;
     banco = ban;
 }         
 public int mostrarSerie () 
 {
   return serie;  
 }        
         
       
}
