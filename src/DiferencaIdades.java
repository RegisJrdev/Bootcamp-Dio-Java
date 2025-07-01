import java.util.Scanner;

public class DiferencaIdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa:");
        String pessoa1Nome = sc.next();

        System.out.println("Digite a idade da primeira pessoa:");
        int pessoa1Idade = sc.nextInt();

        System.out.println("Digite o nome da segunda pessoa:");
        String pessoa2Nome = sc.next();

        System.out.println("Digite a idade da segunda pessoa:");
        int pessoa2Idade = sc.nextInt();

        int diferencaIdades = pessoa1Idade - pessoa2Idade;

        System.out.printf("%s e %s têm uma diferença de %s anos.", pessoa1Nome, pessoa2Nome, diferencaIdades);
    }
}
