package exercício.utilitarios;

import java.util.Random;
import java.util.Scanner;

public class Atividade {
public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var random = new Random();

    System.out.println("Digite um número: ");
    int numero = scanner.nextInt();
    System.out.println("Digite outro número: ");
    int numero2 = scanner.nextInt();

    int min = Math.min(numero, numero2);

    int rand = random.nextInt(min);
    System.out.println("""
            O menor valor entre %s e %s: %s
            E o seu random: %s
            """.formatted(numero, numero2, min, rand));


    
}
    
}
