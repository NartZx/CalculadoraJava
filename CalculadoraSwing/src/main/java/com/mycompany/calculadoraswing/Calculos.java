/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraswing;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João
 */
public class Calculos {
    public static void main(String args[]){
    Calculos c = new Calculos();
    System.out.println("~>"+ c.calculadora("5/5"));
    }
    public String calculadora(String expressao){
        String result;
        List<Double> ListaNumeros = new ArrayList<Double>();
        List<Character> ListaOperadores = new ArrayList<Character>();
        
        ListaNumeros = ObterNumeros(expressao);
        ListaOperadores = ObterOperadores(expressao);
        
        result = CalcularValor(ListaNumeros, ListaOperadores);
        
        return result;
    }
    private String CalcularValor(List<Double> ListaNumeros, List<Character> ListaOperadores){
        String result = "";
        double total = 0.0;
        int j = 0;
        for(int i = 0; i < ListaNumeros.size()-1; i++){
            if(total == 0.0){
                double num1 = ListaNumeros.get(i).doubleValue();
                double num2 = ListaNumeros.get(i+1).doubleValue();
                char op = ListaOperadores.get(i).charValue();
                total = ExecutarOperacao(num1, op, num2);
            }else if(total != 0.0){
                double num2 = ListaNumeros.get(i).doubleValue();
                char op = ListaOperadores.get(j).charValue();
                total = ExecutarOperacao(total, op, num2);
                j++;
            }
        }
        result = ""+total;
        return result;
    }
    private double ExecutarOperacao(double num1, char op, double num2){
        double result = 0.0;
        switch (op) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '/' -> result = num1 / num2;
            case '*' -> result = num1 * num2;
            case '%' -> result = num1 % num2;
            default -> {
            }
        }
        return result;
    }
    private List<Double> ObterNumeros(String expressao){
        List<Double> ListaNumeros = new ArrayList<Double>();
        String NumToStr = "";
        for(int i = 0; i < expressao.length(); i++){
            if(isOperador(expressao.charAt(i))){
                Double Numero = Double.valueOf(NumToStr);
                ListaNumeros.add(Numero);
                NumToStr = "";
            }else{
                NumToStr = NumToStr.concat(""+expressao.charAt(i));
            }
        }
        if(!NumToStr.isEmpty()){
            Double Numero = Double.valueOf(NumToStr);
            ListaNumeros.add(Numero);
        }
        return ListaNumeros;
    }
    private List<Character> ObterOperadores(String expressao){
        List<Character> ListaOperadores = new ArrayList<Character>();
        for(int i = 0; i < expressao.length(); i++){
            if(isOperador(expressao.charAt(i))){
                ListaOperadores.add(new Character(expressao.charAt(i)));
            }
        }
        return ListaOperadores;
    }
    private boolean isOperador(char character){
        boolean isOperador = false;
        if(character == '-' || character == '+' || character == '/' || character == '*' || character == '%'){
            isOperador = true;
        }
        return isOperador;
    }
}