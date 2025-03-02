import java.util.Scanner;

public class Exercicio1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Insira o mês: ");
        int mes = scanner.nextInt();
        System.out.print("Insira o ano: ");
        int ano = scanner.nextInt();
        int dias = 0;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                if (isLeapYear(ano)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
            default:
                System.out.println("Mês inválido. Por favor, insira um mês válido.");
                System.exit(0);
        }
        System.out.println("O mês " + mes + " do ano " + ano + " tem " + dias + " dias.");
        if (isLeapYear(ano)) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
    }

    public static boolean isLeapYear(int ano) {
        if (ano % 400 == 0) {
            return true;
        } else if (ano % 100 == 0) {
            return false;
        } else {
            return ano % 4 == 0;
        }
    }
}