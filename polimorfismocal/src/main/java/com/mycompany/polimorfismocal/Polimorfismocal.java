/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismocal;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Polimorfismocal {

    public static void main(String[] args) {
        clienteTip();}
    public static void clienteTip(){
        int cliente;
        cliente=Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para cliente normal\nDigite 2 para cliente especial"));
    ClienteCalculadoraNormal clienteNormal = new ClienteCalculadoraNormal();
    ClienteCalculadoraEspecial clienteEspecial = new ClienteCalculadoraEspecial();
        if(cliente==1){
             clienteNormal.main(null);
        }
        if(cliente==2){
    clienteEspecial.main(null);
    }
}
}
