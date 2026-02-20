package mybanck.account;

import mybanck.notification.NotificationService;

public class AccountService {

    private NotificationService notification;
    private AccountRepository repository;

    public AccountService(AccountRepository repository, NotificationService notification){
        this.repository = repository;
        this.notification = notification;
    }

    public void createAccount(String owner, double initialBalance){
        Account account = new Account(owner, initialBalance);
        repository.save(account);
    }

    public void transfer(String fromOwner, String toOwner, double amount){
        Account from = repository.findByOwner(fromOwner);
        Account to = repository.findByOwner(toOwner);

        if (from == null && to == null){
            throw new IllegalArgumentException("Account not found");
        }

        from.withdraw(amount);
        to.deposit(amount);

        notification.send("Transfer successful of $" + amount + " from " + fromOwner + " to " + toOwner);
    }

    public double getBalance(String owner){
        Account account = repository.findByOwner(owner);

        if (account == null){
            throw new IllegalArgumentException("Account not found...");
        }

        return account.getBalance();
    }

}
