import java.time.OffsetDateTime;
import java.util.Scanner;

public class CalculaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var baseyear = OffsetDateTime.now().getYear();
        // O método OffsetDateTime.now().getYear() é utilizado      

        System.out.println("Digite seu nome: ");
        var name = scanner.next();

        System.out.println("Digite o ano em que nasceu: ");
        var year = scanner.nextInt();

        var age = baseyear -year;

        System.out.printf("Olá %s, Você possui %s anos de idade.", name, age);
    }
}
