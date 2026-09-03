/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade1;

/**
 *
 * @author João Vitor
 */
public class Venda {
    private String nomeCliente;
    private String formaPagamento;
    private PacoteViagem pacoteViagem;
    
    public Venda(String nomeCliente,String formaPagamento,PacoteViagem pacoteViagem)
    {
        
    this.nomeCliente = nomeCliente;
    this.formaPagamento = formaPagamento;
    this.pacoteViagem = pacoteViagem;
    }
    
   public double converterParaReal(double valorDolar, double cotacaoDolar) {
    double resultado = valorDolar * cotacaoDolar;
    return resultado;

    }
  public void mostrarTotais(double margemLucro,double taxasAdicionais, double cotacaoDolar) {

    double totalDolar = pacoteViagem.calcularTotalPacote(
        margemLucro,
        taxasAdicionais
    );

    double totalReal = converterParaReal(totalDolar, cotacaoDolar);

    System.out.println("Total do pacote em dólar: US$ " + totalDolar);
    System.out.println("Total do pacote em reais: R$ " + totalReal);

   }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public PacoteViagem getPacoteViagem() {
        return pacoteViagem;
    }
}
