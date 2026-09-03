/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade1;

/**
 *
 * @author João Vitor
 */
public class Transporte {
    
    private String Tipo;
    private double valor;

    Transporte(String tipoTransporte, double valorTransporte) {
         this.Tipo = tipoTransporte;
         this.valor = valorTransporte;
    }

    public double getValor() {
    return valor;
    }   

    public String getTipo() {
        return Tipo;
    }
    
}
