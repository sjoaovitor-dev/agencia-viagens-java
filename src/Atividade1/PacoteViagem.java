/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade1;

/**
 *
 * @author João Vitor
 */
public class PacoteViagem {
    
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int quantidadeDias;
    
 
   
          public double calcularTotalHospedagem()
    {
      return quantidadeDias * hospedagem.getValorDiaria();
    }
          
     public double calcularLucro(double margem,double valor)    
     {
      margem = (valor * margem) / 100;
      double lucro = margem + valor;
      
      return lucro;
     }
     
     public double calcularTotalPacote(double margemLucro, double taxasAdicionais)
     {
        transporte.getValor(); 
        double valorTransporte = transporte.getValor();
        double totalHospedagem = calcularTotalHospedagem();
        
        double subtotal = valorTransporte + totalHospedagem + taxasAdicionais;
        
        return calcularLucro(margemLucro, subtotal);
     }
     
     public PacoteViagem(Transporte transporte, Hospedagem hospedagem,
                          String destino, int quantidadeDias) {

     this.transporte = transporte;
     this.hospedagem = hospedagem;
     this.quantidadeDias = quantidadeDias;
     this.destino = destino;
     }

    public Transporte getTransporte() {
        return transporte;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public String getDestino() {
        return destino;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }
}
