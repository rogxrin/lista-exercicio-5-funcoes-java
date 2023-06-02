import java.util.Scanner;

public class AtividadeDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        double precoComAcrescimo = calcularPrecoComAcrescimo(preco);
        System.out.println("O preço com aumento de 10% é: " + precoComAcrescimo);
    }

    public static double calcularPrecoComAcrescimo(double preco) {
        double acrescimo = preco * 0.1;
        return preco + acrescimo;
   

    }


}
