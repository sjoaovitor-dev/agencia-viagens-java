/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("   CADASTRO DE PACOTE DE VIAGEM");
        System.out.println("==================================");

        // DADOS DO TRANSPORTE
        System.out.println("\n--- TRANSPORTE ---");

        System.out.print("Informe o tipo de transporte: ");
        String tipoTransporte = entrada.nextLine();

        System.out.print("Informe o valor do transporte em dólar: ");
        double valorTransporte = entrada.nextDouble();
        entrada.nextLine();

        Transporte transporte = new Transporte(
                tipoTransporte,
                valorTransporte
        );

        // DADOS DA HOSPEDAGEM
        System.out.println("\n--- HOSPEDAGEM ---");

        System.out.print("Informe a descrição da hospedagem: ");
        String descricaoHospedagem = entrada.nextLine();

        System.out.print("Informe o valor da diária em dólar: ");
        double valorDiaria = entrada.nextDouble();
        entrada.nextLine();

        Hospedagem hospedagem = new Hospedagem(
                descricaoHospedagem,
                valorDiaria
        );

        // DADOS DO PACOTE
        System.out.println("\n--- PACOTE DE VIAGEM ---");

        System.out.print("Informe o destino: ");
        String destino = entrada.nextLine();

        System.out.print("Informe a quantidade de dias: ");
        int quantidadeDias = entrada.nextInt();

        System.out.print("Informe a margem de lucro em porcentagem: ");
        double margemLucro = entrada.nextDouble();

        System.out.print("Informe o valor das taxas adicionais em dólar: ");
        double taxasAdicionais = entrada.nextDouble();
        entrada.nextLine();

        PacoteViagem pacoteViagem = new PacoteViagem(
                transporte,
                hospedagem,
                destino,
                quantidadeDias
        );

        double totalHospedagem =
                pacoteViagem.calcularTotalHospedagem();

        double totalPacote =
                pacoteViagem.calcularTotalPacote(
                        margemLucro,
                        taxasAdicionais
                );

        // EXIBIÇÃO DO PACOTE
        System.out.println("\n==================================");
        System.out.println("       INFORMAÇÕES DO PACOTE");
        System.out.println("==================================");

        System.out.println("Destino: " + pacoteViagem.getDestino());
        System.out.println("Quantidade de dias: "
                + pacoteViagem.getQuantidadeDias());

        System.out.println("Tipo de transporte: "
                + transporte.getTipo());

        System.out.println("Valor do transporte: US$ "
                + transporte.getValor());

        System.out.println("Hospedagem: "
                + hospedagem.getDescricao());

        System.out.println("Valor da diária: US$ "
                + hospedagem.getValorDiaria());

        System.out.println("Total da hospedagem: US$ "
                + totalHospedagem);

        System.out.println("Margem de lucro: "
                + margemLucro + "%");

        System.out.println("Taxas adicionais: US$ "
                + taxasAdicionais);

        System.out.println("Total do pacote: US$ "
                + totalPacote);

        // DADOS DA VENDA
        System.out.println("\n==================================");
        System.out.println("        CADASTRO DA VENDA");
        System.out.println("==================================");

        System.out.print("Informe o nome do cliente: ");
        String nomeCliente = entrada.nextLine();

        System.out.print("Informe a forma de pagamento: ");
        String formaPagamento = entrada.nextLine();

        System.out.print("Informe a cotação atual do dólar: ");
        double cotacaoDolar = entrada.nextDouble();

        Venda venda = new Venda(
                nomeCliente,
                formaPagamento,
                pacoteViagem
        );

        // EXIBIÇÃO DA VENDA
        System.out.println("\n==================================");
        System.out.println("        INFORMAÇÕES DA VENDA");
        System.out.println("==================================");

        System.out.println("Cliente: "
                + venda.getNomeCliente());

        System.out.println("Forma de pagamento: "
                + venda.getFormaPagamento());

        System.out.println("Destino: "
                + pacoteViagem.getDestino());

        venda.mostrarTotais(
                margemLucro,
                taxasAdicionais,
                cotacaoDolar
        );

        entrada.close();
    }
}