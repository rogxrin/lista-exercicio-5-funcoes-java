import java.util.Scanner;

public class AtividadeQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        double mediaAritmetica = calcularMediaAritmetica(valor1, valor2, valor3);
        double mediaHarmonica = calcularMediaHarmonica(valor1, valor2, valor3);
        double mediaGeometrica = calcularMediaGeometrica(valor1, valor2, valor3);

        System.out.println("Média Aritmética: " + mediaAritmetica);
        System.out.println("Média Harmônica: " + mediaHarmonica);
        System.out.println("Média Geométrica: " + mediaGeometrica);
    }

    public static double calcularMediaAritmetica(double valor1, double valor2, double valor3) {
        return (valor1 + valor2 + valor3) / 3;
    }

    public static double calcularMediaHarmonica(double valor1, double valor2, double valor3) {
        return 3 / ((1 / valor1) + (1 / valor2) + (1 / valor3));
    }

    public static double calcularMediaGeometrica(double valor1, double valor2, double valor3) {
        return Math.pow(valor1 * valor2 * valor3, 1.0 / 3.0);
    }
}
