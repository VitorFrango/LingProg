import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // System.in is a standard input stream
        PrintWriter out = new PrintWriter(System.out, true); // System.out is a standard output stream
        System.out.print("Insira um código Unicode (33-127): ");
        int codigo = scanner.nextInt();

        // Verifica se o código está dentro do intervalo 33-127
        if (codigo >= 33 && codigo <= 127) {
            char caractere = (char) codigo; // Converte o código para um caractere
            out.println(codigo + ": " + caractere);
        } else {
            // Se o código não estiver no intervalo, exibe uma mensagem de erro
            out.println("Código inválido. Por favor, insira um número entre 33 e 127.");
        }
    }
}