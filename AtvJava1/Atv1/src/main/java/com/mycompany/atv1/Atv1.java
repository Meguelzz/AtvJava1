/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atv1 {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Valor total da fatura: ");
        double valorTotal = scanner.nextDouble();
        
        System.out.print("Número de parcelas: ");
        int numeroParcelas = scanner.nextInt();
        
        System.out.print("Percentual de desconto por pagamento antecipado (%): ");
        double percentualDesconto = scanner.nextDouble();
        
        System.out.print("Percentual de multa por atraso (%): ");
        double percentualMulta = scanner.nextDouble();
        
        // cálculo do valor total com desconto
        double desconto = (percentualDesconto / 100) * valorTotal;
        double valorComDesconto = valorTotal - desconto;
        
        // cálculo do valor de cada parcela sem desconto
        double valorParcelaSemDesconto = valorTotal / numeroParcelas;
        
        // cálculo do valor de cada parcela com multa
        double multa = (percentualMulta / 100) * valorParcelaSemDesconto;
        double valorParcelaComMulta = valorParcelaSemDesconto + multa;
        
        // impressão dos resultados
        System.out.printf("Valor total com desconto: R$ %.2f%n", valorComDesconto);
        System.out.printf("Valor de cada parcela com multa: R$ %.2f (Multa: R$ %.2f)%n", valorParcelaComMulta, multa);
        
        scanner.close();    }
}
