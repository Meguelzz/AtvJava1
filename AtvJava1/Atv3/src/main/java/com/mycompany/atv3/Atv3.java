/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atv3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Dados pessoais do usuário
        System.out.print("Digite seu nome: ");
        String seuNome = scanner.nextLine();
        
        System.out.print("Digite sua idade: ");
        int suaIdade = scanner.nextInt();
        
        System.out.print("Digite seu peso (kg): ");
        double seuPeso = scanner.nextDouble();
        
        System.out.print("Digite sua altura (m): ");
        double suaAltura = scanner.nextDouble();
        
        scanner.nextLine(); // Consumir a nova linha
        System.out.print("Digite sua série favorita: ");
        String suaSerie = scanner.nextLine();
        
        System.out.print("Digite sua música favorita: ");
        String suaMusica = scanner.nextLine();
        
        System.out.print("Digite seu jogo favorito: ");
        String seuJogo = scanner.nextLine();
        
        // Leitura dos dados da outra pessoa
        System.out.print("Digite o nome da pessoa: ");
        String nomePessoa = scanner.nextLine();
        
        System.out.print("Digite a idade da pessoa: ");
        int idadePessoa = scanner.nextInt();
        
        System.out.print("Digite o peso da pessoa (kg): ");
        double pesoPessoa = scanner.nextDouble();
        
        System.out.print("Digite a altura da pessoa (m): ");
        double alturaPessoa = scanner.nextDouble();
        
        scanner.nextLine(); // Consumir a nova linha
        System.out.print("Digite a série favorita da pessoa: ");
        String seriePessoa = scanner.nextLine();
        
        System.out.print("Digite a música favorita da pessoa: ");
        String musicaPessoa = scanner.nextLine();
        
        System.out.print("Digite o jogo favorito da pessoa: ");
        String jogoPessoa = scanner.nextLine();

        // contagem de características iguais //
        int caracteristicasIguais = 0;

        // comparações //
        if (nomePessoa.equals(seuNome)) {
            System.out.println("Pessoa com nome igual.");
            caracteristicasIguais++;
        } else {
            System.out.println("Pessoa com o nome diferente.");
        }

        if (idadePessoa == suaIdade) {
            caracteristicasIguais++;
        }

        if (pesoPessoa == seuPeso) {
            caracteristicasIguais++;
        }

        if (alturaPessoa == suaAltura) {
            caracteristicasIguais++;
        }

        if (seriePessoa.equals(suaSerie)) {
            caracteristicasIguais++;
        }

        if (musicaPessoa.equals(suaMusica)) {
            caracteristicasIguais++;
        }

        if (jogoPessoa.equals(seuJogo)) {
            caracteristicasIguais++;
        }
        
        if (caracteristicasIguais >= 3) {
            System.out.println("Esta pessoa é bem parecida comigo!");
        } else {
            System.out.println("Esta pessoa não é tão parecida assim.");
        }

        scanner.close();
    }
}
    
