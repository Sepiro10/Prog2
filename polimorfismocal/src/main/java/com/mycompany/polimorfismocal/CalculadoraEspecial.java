/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismocal;

/**
 *
 * @author sebas
 */
public class CalculadoraEspecial implements InterfazCalculadora{
         public int sumar(int num1, int num2) {
         int suma= (num1+num2)/2;
        return (suma);
    }

    public int restar(int num1, int num2) {
        int resta=(num1-num2)/2;
        return (resta);
    }

    public int multiplicar(int num1, int num2) {
       int multiplicacion=(num1*num2)/2;
        return (multiplicacion);
    }

    public int dividir(int num1, int num2) {
        int division=(num1/num2)/2;
        return (division);
    }

    public double calcularRaizCuadrada(int num1) {
        double raiz= (Math.sqrt(num1))/2;
        return (raiz);
}
}
