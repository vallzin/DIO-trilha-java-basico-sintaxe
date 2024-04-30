import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pelo scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da Conta!");
        String numero = scanner.next();

        System.out.println("Por favor, digite o nome do Cliente!");
        String cliente = scanner.next();

        System.out.println("Digite o valor de depósito: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá "+ cliente +" obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua Agència é "+agencia+" conta "+numero);
        System.out.println("e seu saldo "+saldo+" já está disponível para saque");
        System.out.println("Conta criada");
    }
}
