import java.util.Scanner;

public class AtividadeCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println((i + " ").repeat(i));
        }
    }
}
