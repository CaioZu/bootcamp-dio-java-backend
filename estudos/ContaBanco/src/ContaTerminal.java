import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da agência.");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, o número da conta.");
        int numero = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Por favor, digite o seu nome.");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("por favor, digite seu saldo.");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
