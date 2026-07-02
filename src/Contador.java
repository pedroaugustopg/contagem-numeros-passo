public class Contador {

    public static void contador(int inicio, int fim, int passo) {

        // Garante que o passo seja sempre positivo
        if (passo < 0) {
            passo = -passo;
        }

        // Evita passo igual a zero
        if (passo == 0) {
            passo = 1;
        }

        System.out.printf(
                "Contagem de %d até %d, com intervalo de %d em %d%n",
                inicio, fim, passo, passo
        );

        try {
            Thread.sleep(3000); // Pausa de 3 segundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        if (inicio < fim) {
            for (int cont = inicio; cont <= fim; cont += passo) {
                System.out.print(cont + " ");

                try {
                    Thread.sleep(500); // Pausa de 0,5 segundo
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        } else {
            for (int cont = inicio; cont >= fim; cont -= passo) {
                System.out.print(cont + " ");

                try {
                    Thread.sleep(500); // Pausa de 0,5 segundo
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        System.out.println("FIM!");
    }
}
