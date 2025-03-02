/*
Exercício 3
    Escreva um novo programa que peça ao utilizador para inserir dois números e os some.
        a) Dois números inteiros (int).
        b)Dois números de vírgula flutuante (float).

*/
import java.io.PrintWriter;
import java.util.Scanner;
public class Exercicio1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // System.in is a standard input stream
        PrintWriter out = new PrintWriter(System.out, true); // System.out is a standard output stream
        System.out.print("Insira um número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.print("Insira outro número inteiro: ");
        int num2 = scanner.nextInt();
        int soma = num1 + num2;
        out.println("A soma dos números inteiros é: " + soma);

        System.out.print("Insira um número de vírgula flutuante: ");
        float num3 = scanner.nextFloat();
        if (num3 == 0) {
            out.println("Número inválido. Por favor, insira um número diferente de 0.");
            System.exit(0);
        }
        System.out.print("Insira outro número de vírgula flutuante: ");
        float num4 = scanner.nextFloat();
        if (num4 == 0) {
            out.println("Número inválido. Por favor, insira um número diferente de 0.");
            System.exit(0);
        }
        float soma2 = num3 + num4;
        out.println("A soma dos números de vírgula flutuante é: " + soma2);
    }
}
