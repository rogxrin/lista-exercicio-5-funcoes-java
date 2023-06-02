import java.util.Scanner;

public class AtividadeOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo do item: ");
        double custo = scanner.nextDouble();

        System.out.print("Digite a taxa de imposto : ");
        double taxaImposto = scanner.nextDouble();

        double custoComImposto = somaImposto(taxaImposto, custo);

        System.out.println("O custo do item com imposto é: " + custoComImposto);
    }

    public static double somaImposto(double taxaImposto, double custo) {
        double imposto = custo * (taxaImposto / 100);
        return custo + imposto;
    }
}
