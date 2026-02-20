package mybanck;

import mybanck.account.Account;
import mybanck.account.AccountService;
import mybanck.notification.EmailNotification;
import mybanck.notification.NotificationService;
import mybanck.notification.SmsNotification;

public class Main {
    public static void main(String[] args) {

        // Create the concrete implementation
        NotificationService email = new EmailNotification();
        NotificationService sms = new SmsNotification();

        // Inject dependency email or sms
        AccountService accountService= new AccountService(sms);

        // Create accounts
        Account account1 = new Account("Lucas", 250);
        Account account2 = new Account("Pedro", 700);

        // Transfer
        accountService.transfer(account1, account2, 100);

        // Show balance
        System.out.println("Balance Lucas: " + account1.getBalance());
        System.out.println("Balance Pedro: " + account2.getBalance());


    }
}
