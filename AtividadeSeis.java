import java.util.Scanner;

public class AtividadeSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        int soma = calcularSoma(num1, num2, num3);

        System.out.println("A soma dos três números é: " + soma);
    }

    public static int calcularSoma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
