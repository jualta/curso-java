
package com.mycompany.mavenproject1;


public class Persona
{
   String nombre;
   String apellido;
   String sexo;
   int edad; 
   int peso;
   float tamaño;
    
   public Persona(String nom,String ape,String sex,int eda, int pes) 
   {
       nombre=nom;
       apellido=ape;
       sexo=sex;
       edad=eda;
       peso=pes;    
   }
   public float mostrarTamaño()
   {
      return tamaño;     
   }   
}
