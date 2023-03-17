/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismocal;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class ClienteCalculadoraNormal {
    public static void main(String[] args) {
        InterfazCalculadora calculadora = new CalculadoraNormal();

        int num1, num2 ;
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero1"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero2"));
        

        int resultadoSuma = calculadora.sumar(num1,num2);
        JOptionPane.showMessageDialog(null,"El resultado de la suma es: " + resultadoSuma);

        int resultadoResta = calculadora.restar(num1, num2);
        JOptionPane.showMessageDialog(null,"El resultado de la resta es: " + resultadoResta);

        int resultadoMultiplicacion = calculadora.multiplicar(num1, num2);
        JOptionPane.showMessageDialog(null,"El resultado de la multiplicación es: " + resultadoMultiplicacion);

        int resultadoDivision = calculadora.dividir(num1, num2);
        JOptionPane.showMessageDialog(null,"El resultado de la división es: " + resultadoDivision);

        double resultadoRaizCuadrada = calculadora.calcularRaizCuadrada(num1);
        JOptionPane.showMessageDialog(null,"El resultado de la raíz cuadrada es: " + resultadoRaizCuadrada);
    }
}
 

