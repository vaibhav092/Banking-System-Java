package Entity;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<Account> accounts=new ArrayList<Account>();

    public void add(Account account) {
        accounts.add(account);
    }
    public Account getAccount(int id) {
        for (Account account : accounts) {
            if(id==account.id){
                return account;
            }
        }
        return null;
    }
}
