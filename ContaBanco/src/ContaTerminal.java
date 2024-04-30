import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pelo scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 237.48;


        System.out.println("Por favor, digite o número da Agência!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Conta!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do Cliente!");
        String cliente = scanner.next();

        scanner.close();
    }
}
