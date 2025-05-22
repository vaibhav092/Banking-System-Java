package Entity;

public class Account {

    public Account(String name, String password) {
        this.id = nextId++;        // assign and then increment
        this.name = name;
        this.password = password;
        this.balance = 0;
    }
    static int nextId = 1;
    public int id ;
    private String name;
    private String password;
    private int balance;

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance+= balance;
    }
}
