import java.util.Scanner;

public class Exercicio1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira a idade da pessoa: ");
        int idade = scanner.nextInt();
        System.out.println(validarFaixaEtaria(idade));
        scanner.close();
    }

    public static String validarFaixaEtaria(int idade) {
        if (idade < 0) {
            return "Idade inválida. Por favor, insira uma idade válida.";
        } else if (idade <= 14) {
            return "Criança";
        } else if (idade <= 17) {
            return "Adolescente";
        } else if (idade <= 65) {
            return "Adulto";
        } else {
            return "Idoso";
        }
    }
}