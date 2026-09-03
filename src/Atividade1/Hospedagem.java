/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade1;

/**
 *
 * @author João Vitor
 */
public class Hospedagem {
    
    private String descricao;
    private double valorDiaria;

    Hospedagem(String descricaoHospedagem, double valorDiaria) {
        this.descricao = descricaoHospedagem;
        this.valorDiaria = valorDiaria;
    }


    public String getDescricao() {
        return descricao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    
    
}
