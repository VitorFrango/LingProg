/*
* Exercício 6
* Implemente um método para calcular o dia da semana, segundo o método de congruência deZeller, em que:
*                             H = (d + 26(m+1)/10 + k + k/4 + J/4 + 5J) % 7
* d - dia do mês,
* m - mês (1- Janeiro, 2- Fevereiro, ...)
* J – século (igual a ano/100)
* k – ano do século (igual ano % seculo)
* H= dia da semana (0 = sábado, 1 = domingo, ...)
*
* a) Crie um programa que dada uma data, escreva no ecrã o dia da semana a que esta serefere.
* b)Crie um método que escreve por extenso o dia (“Segunda”, “Terça”, ...). Use ainstrução switch.c) Utilize a classe desenvolvida no exercício 5 e imprima a informação se o ano é bissextoe o dia da semana
*
* */

import java.util.Scanner; // Import the Scanner class

public class Exercicio1_6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o dia: ");
        int dia = scanner.nextInt();
        System.out.print("Insira o mês: ");
        int mes = scanner.nextInt();
        System.out.print("Insira o ano: ");
        int ano = scanner.nextInt();

        int diaSemana = calcularDiaSemana(dia, mes, ano);
        String nomeDiaSemana = nomeDiaSemana(diaSemana);

        System.out.println("O dia "  + dia + "/" + mes + "/" + ano + " é um(a) " + nomeDiaSemana + ".");
        if (Exercicio1_5.isLeapYear(ano)) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
    }
    public static int calcularDiaSemana(int dia, int mes, int ano) {
        if (mes < 3) {
            mes += 12;
            ano -= 1;
        }
        int K = ano % 100;
        int j = ano / 100;
        int h = (dia +26 * (mes + 1) / 10 + K + K / 4 + j / 4 + 5 * j) % 7;
        return h;
    }

    public static String nomeDiaSemana(int diaSemana) {
        switch (diaSemana) {
            case 0: return "Sábado";
            case 1: return "Domingo";
            case 2: return "Segunda-feira";
            case 3: return "Terça-feira";
            case 4: return "Quarta-feira";
            case 5: return "Quinta-feira";
            case 6: return "Sexta-feira";
            default: return "Dia inválido";
        }
    }
}
