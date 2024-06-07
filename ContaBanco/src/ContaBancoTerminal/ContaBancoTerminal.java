package ContaBancoTerminal;
import java.util.Scanner;

public class ContaBancoTerminal {
    public static String dadosStr(){
        System.out.println("Digite o seu nome para efetuar o cadastro de conta: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        return nome;
    }
    public static void dados(String nome){
        System.out.println("Digite a agencia da sua conta: ");
        Scanner scint = new Scanner(System.in);
        String agencia = scint.nextLine();
        System.out.println("Digite o numero da conta: ");
        int numero = scint.nextInt();
        System.out.println("Digite o saldo da conta: ");
        double saldo = scint.nextDouble();
        System.out.println("Olá "+nome);
        System.out.println("Seus dados são: ");
        System.out.println("Agencia: "+agencia+ " Numero da conta: "+numero+ " Saldo: "+saldo);
    }
    public void InformacoesConta(){
        String nome = dadosStr();
        dados(nome);

    }
}
