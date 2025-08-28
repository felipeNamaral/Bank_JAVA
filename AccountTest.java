import java.util.Scanner;

public class AccountTest {
        public static void main(String[] args) {
                Account account1 = new Account("Jame Green", 0.00, 1234, 1000.00);
                Account account2 = new Account("John Blue", 0.00, 34567, 2000.00);
                Account account3 = new Account("John red", 0.00, 43548, 3000.00);

                account1.imprimeDados();
                account2.imprimeDados();
                account3.imprimeDados();

                Scanner input = new Scanner(System.in);

                System.out.print("Enter deposit amout for account1:");
                double depositAmount = input.nextDouble();
                System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
                account1.deposit(depositAmount);

                account1.imprimeDados();

                System.out.print("Enter deposit amount for account2: ");
                depositAmount = input.nextDouble();
                System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
                account2.deposit(depositAmount);

                account2.imprimeDados();

                System.out.print("Enter deposit amount for account3: ");
                depositAmount = input.nextDouble();
                System.out.printf("%nadding %.2f to account3 balance%n%n", depositAmount);
                account3.deposit(depositAmount);

                account3.imprimeDados();

                System.out.printf("---------------------------------------------------------- %n");

                account1.imprimeDados();
                account2.imprimeDados();
                account3.imprimeDados();

                input.close();
        }
}
