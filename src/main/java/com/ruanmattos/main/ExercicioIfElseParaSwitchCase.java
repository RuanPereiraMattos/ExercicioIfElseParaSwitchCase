package com.ruanmattos.main;

import java.util.Scanner;

/**
 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
 *
 * Escrever na tela o dia da semana correspondente, conforme exemplos.
 *
 * Entrada 1 Saída Dia da semana: domingo
 *
 * Entrada 4 Saída Dia da semana: quarta
 *
 * Entrada 9 Saída Dia da semana: valor inválido/
 *
 * @author Ruan Pereira Mattos
 */
public class ExercicioIfElseParaSwitchCase {

    public static void main(String[] args) {
        System.out.println("Bem vindo(a) ao programa de dias da semana");
        System.out.print("Digite um valor entre 1 e 7: ");
        Scanner s = new Scanner(System.in);
        int opcao = s.nextInt();
        String dia = "";
        if (opcao == 1) {
            dia = "domingo";
        } else if (opcao == 2) {
            dia = "segunda";
        } else if (opcao == 3) {
            dia = "terça";
        } else if (opcao == 4) {
            dia = "quarta";
        } else if (opcao == 5) {
            dia = "quinta";
        } else if (opcao == 6) {
            dia = "sexta";
        } else if (opcao == 7) {
            dia = "sábado";
        } else {
            dia = "Inválido";
        }
        System.out.println("Dia da semana: " + dia);
        s.close();
    }
}
