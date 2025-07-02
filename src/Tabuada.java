//Escreva um código onde o usuário entra com um número e seja gerada a tabela de multiplicação de 1 a 10 desse número
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroFornecido = teclado.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%s X %s = %s \n", numeroFornecido, i, numeroFornecido * i);
        }
    }
}
