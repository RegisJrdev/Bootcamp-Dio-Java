import java.util.Scanner;

public class CalculaAreaQuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado do quadrado que deseja calcular a área.");
        double ladoQuadrado = sc.nextInt();

        double areaQuadrado = Math.pow(ladoQuadrado, 2);

        System.out.printf("A área do quadrado é igual á: %s.", areaQuadrado);
    }
}
