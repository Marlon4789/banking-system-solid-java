package mybanck.account;

import mybanck.notification.NotificationService;

public class AccountService {

    private NotificationService notification;

    public AccountService(NotificationService notification){
        this.notification = notification;
    }

    public void transfer(Account from, Account to, double amount){
        from.withdraw(amount);
        to.deposit(amount);

        notification.send(
                "Successful transfer of $" + amount + " from " + from.getOwner() +
                        " to " + to.getOwner()
        );
    }

}
