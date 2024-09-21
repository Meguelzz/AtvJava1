/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atv2 {
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // definindo o salário mínimo //
        double salarioMinimo = 1302.00; // Você pode ajustar conforme necessário
        
        // leitura da idade //
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (idade > 21) {
            System.out.println("Você tem mais de 21 anos.");
        } else {
            System.out.println("Você não tem mais de 21 anos.");
        }

        // leitura do salário //
        System.out.print("Digite seu salário: ");
        double salario = scanner.nextDouble();
        if (salario > 5 * salarioMinimo) {
            System.out.println("Seu salário é maior que 5 vezes o salário mínimo.");
        } else {
            System.out.println("Seu salário não é maior que 5 vezes o salário mínimo.");
        }

        // leitura da altura //
        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();
        if (altura > 1.75) {
            System.out.println("Sua altura é maior que 1,75 m.");
        } else {
            System.out.println("Sua altura não é maior que 1,75 m.");
        }

        // leitura do peso //
        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();
        if (peso > 70) {
            System.out.println("Seu peso é maior que 70 kg.");
        } else {
            System.out.println("Seu peso não é maior que 70 kg.");
        }

        // leitura do sobrenome //
        scanner.nextLine(); // Consumir a nova linha
        System.out.print("Digite seu sobrenome: ");
        String seuSobrenome = scanner.nextLine();
        
        System.out.print("Digite o sobrenome da pessoa: ");
        String sobrenomePessoa = scanner.nextLine();
        if (!sobrenomePessoa.equals(seuSobrenome)) {
            System.out.println("O sobrenome é diferente do seu.");
        } else {
            System.out.println("O sobrenome é igual ao seu.");
        }

        // leitura do gênero //
        System.out.print("Digite seu gênero (f/m): ");
        char genero = scanner.next().charAt(0);
        if (genero == 'f') {
            System.out.println("O gênero informado é igual a 'f'.");
        } else {
            System.out.println("O gênero informado não é igual a 'f'.");
        }

        scanner.close();
    }
}