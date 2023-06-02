import java.util.Scanner;

public class AtividadeSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        char resultado = PositivoNegativo(numero);

        System.out.println("Resultado: " + resultado);
    }

    public static char PositivoNegativo(int numero) {
        if (numero > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }
}
