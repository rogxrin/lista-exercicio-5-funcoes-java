import java.util.Scanner;

public class AtividadeNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int reverso = calcularNumeroReverso(numero);

        System.out.println("O reverso do número é: " + reverso);
    }

    public static int calcularNumeroReverso(int numero) {
        int reverso = 0;

        while (numero != 0) {
            reverso = reverso * 10 + numero % 10;
            numero = numero / 10;
        }

        return reverso;
    }
}
