import java.util.Scanner;

public class AccountTest {

        public static void clearScreen() {
                System.out.print("\033[H\033[2J");
                System.out.flush();
        }

        public static void pause() {
                System.out.println("Pressione ENTER para continuar...");
                try {
                        System.in.read();
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                String aux, aux2;
                double valor;

                Account[] contas = {
                                new Account("Jame Green", 1234, 1000.00),
                                new Account("John Blue", 34567, 2000.00),
                                new Account("John red", 43548, 3000.00)
                };

                System.out.println("======================================");
                System.out.println("       BEM-VINDO AO BANCO JAVA       ");
                System.out.println("======================================");
                System.out.println("      Seu dinheiro em boas mãos!      ");
                System.out.println("======================================\n");
                pause();

                System.out.print("Digite o número da conta:");
                int cont = input.nextInt();
                boolean encontrada = false;

                for (int i = 0; i < contas.length; i++) {
                        if (contas[i].getNumber() == cont) {
                                cont = i;
                                encontrada = true;
                                break;
                                
                        }

                }
                if (!encontrada) {
                        System.out.println("Conta " + cont + " não encontrada!");
                        System.exit(0);
                }

                while (true) {
                        clearScreen();
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
                                        contas[cont].imprimeDados();
                                        pause();
                                        break;
                                case 2:
                                        System.out.print("Digite quanto quer depositar: ");
                                        valor = input.nextDouble();
                                        contas[cont].deposit(valor);
                                        pause();
                                        break;
                                case 3:
                                        System.out.print("Digite quanto quer sacar: ");
                                        valor = input.nextDouble();
                                        contas[cont].withdraw(valor);
                                        pause();
                                        break;
                                case 4:
                                        System.out.print("Digite a senha antiga: ");
                                        aux = input.nextLine();
                                        System.out.print("Digite a senha nova: ");
                                        aux2 = input.nextLine();
                                        contas[cont].changePassword(aux, aux2);
                                        pause();
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
