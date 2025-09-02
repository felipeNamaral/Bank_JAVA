import java.util.Scanner;

public class AccountTest {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                String aux, aux2;
                double valor;
                Account account1 = new Account("Jame Green", 1234, 1000.00);
                Account account2 = new Account("John Blue", 34567, 2000.00);
                Account account3 = new Account("John red", 43548, 3000.00);

                while (true) {
                        System.out.println("====== MENU DO BANCO ======");
                        System.out.println("1. Ver saldo");
                        System.out.println("2. Depositar");
                        System.out.println("3. Sacar");
                        System.out.println("4. Trocar senha");
                        System.out.println("5. Sair");
                        System.out.println("===========================");
                        System.out.print("Escolha uma opção: ");

                        int opcao = input.nextInt();
                        input.nextLine();

                        switch (opcao) {
                                case 1:
                                        // Ver saldo
                                        account1.imprimeDados();
                                        account2.imprimeDados();
                                        account3.imprimeDados();
                                        break;
                                case 2:
                                        // Depositar (exemplo simples para a conta 1)

                                        break;
                                case 3:
                                        System.out.print("Digite quanto quer sacar: ");
                                        valor = input.nextDouble();
                                        account1.withdraw(valor);
                                        break;
                                case 4:
                                        System.out.print("Digite a senha antiga: ");
                                        aux = input.nextLine();
                                        System.out.print("Digite a senha nova: ");
                                        aux2 = input.nextLine();
                                        account1.changePassword(aux, aux2);

                                        break;
                                case 5:
                                        System.out.println("Saindo do sistema...");
                                        input.close();
                                        return; // Encerra o método main
                                default:
                                        System.out.println("Opção inválida. Tente novamente.");
                                        break;
                        }
                }
        }
}
