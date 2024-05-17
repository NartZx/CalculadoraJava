/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora.Calculos;

import com.mycompany.calculadora.enums.Cal;

/**
 *
 * @author 202304025312
 */
public class Calculos {
   private Double total;
   private double i;
    public Calculos(){
     total = 0.0;
     i = 0.0; 
    }
    
    public Double Calc(Cal calcul, Double valor){
      if(calcul.equals(Cal.SOMA)){
         total = total + valor;
      }else if(calcul.equals(Cal.Subtracao)){
               total = (-total) - valor;
               
      }else if(calcul.equals(Cal.Multiplicacao)){
          for(i=total; i <= valor; i++){     
          total = total + valor;
          }
      }else if(calcul.equals(Cal.Divisao)){
        total /= valor;
      }else if(calcul.equals(Cal.Porcentagem)){
        total %= valor;
      }else{
      
      }
     return total;
     
    }
    public Double getTotal(){
     return this.total;
    }
    
    public void zerar(){
     total = 0.0;
     
    }
} 

