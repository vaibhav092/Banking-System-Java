package Service;

import Entity.*;

import java.util.Scanner;

public class BankingService {


    Scanner scanner = new Scanner(System.in);
    Bank bank = new Bank();

    public void createAccount() {
        String name =scanner.nextLine();
        String password =scanner.nextLine();
        Account account = new Account(name, password);
        System.out.println("Account has be Created Successfully "+account.id);
        bank.add(account);
    }

    public void addMoney(){
        int id=scanner.nextInt();
        Account account =bank.getAccount(id);
        System.out.print("Enter amount to Deposit: ");
        int amount=scanner.nextInt();
        account.setBalance(amount);
    }

    public void withdrawMoney(){
        int id=scanner.nextInt();
        Account account =bank.getAccount(id);
        System.out.print("Enter amount to Withdraw: ");
        int amount=scanner.nextInt();
        account.setBalance(-amount);
    }
    public void getBalance(){
        int id=scanner.nextInt();
        Account account = bank.getAccount(id);
        System.out.println("Account Balance: "+account.getBalance());
    }
}
