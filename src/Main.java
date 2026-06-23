import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Contagens pré-definidas
        Contador.contador(1, 10, 1);
        Contador.contador(10, 0, 2);

        // Contagem personalizada
        System.out.println("\nPersonalize sua contagem!");

        System.out.print("Início: ");
        int inicio = scanner.nextInt();

        System.out.print("Fim: ");
        int fim = scanner.nextInt();

        System.out.print("Passo: ");
        int passo = scanner.nextInt();

        Contador.contador(inicio, fim, passo);

        scanner.close();
    }
}
