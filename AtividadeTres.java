import java.util.Scanner;

public class AtividadeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        double temperaturaCelsius = converterParaCelsius(temperaturaFahrenheit);
        System.out.println("A temperatura em Celsius é: " + temperaturaCelsius);
    }

    public static double converterParaCelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }
}
