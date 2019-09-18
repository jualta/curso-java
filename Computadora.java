
package com.mycompany.mavenproject7;


public class Computadora 
{
  String marca;
  int año;
  String sistema;
  int gb;
  String procesador;  
    
public Computadora(String mar,int _año,String sist, int _gb)
{
    marca = mar;
    año = _año;
    sistema = sist;
    gb = _gb;
}        
    
public String mostrarProcesador()
{
  return procesador;      
}   
}
