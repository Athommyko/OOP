package exercício.utilitarios;

import java.util.Random;

public class Aleatoriedade {
    public static void main(String[] args) {
        var random = new Random();

        int valorAleatorio = random.nextInt(100);
        System.out.println("Int aleatório no máximo 100: %s".formatted(valorAleatorio));
         

        int valorAleatorio2 = random.nextInt();
        System.out.println("Int aleatório: %s".formatted(valorAleatorio2));

        double valorAleatorio3 = random.nextDouble();
        System.out.println("Double aleatório: %s".formatted(valorAleatorio3));

        double valorAleatorio4 = random.nextDouble(100.0);
        System.out.println("Double aleatório no máximo 100: %s".formatted(valorAleatorio4));
    }
}
