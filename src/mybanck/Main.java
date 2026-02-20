package mybanck;

import mybanck.account.Account;
import mybanck.account.AccountRepository;
import mybanck.account.AccountService;
import mybanck.infrastructure.InMemoryAccountRepository;
import mybanck.notification.EmailNotification;
import mybanck.notification.NotificationService;
import mybanck.notification.SmsNotification;

public class Main {
    public static void main(String[] args) {

        // Create the concrete implementation
        AccountRepository repository = new InMemoryAccountRepository();
        NotificationService notification = new EmailNotification();

        // Inject dependency repository and email notification
        AccountService service= new AccountService(repository, notification);

        // Create accounts
        service.createAccount("Anna", 900);
        service.createAccount("Lucas", 500);

        // Transfer
        service.transfer("Anna", "Lucas", 300);

        // Show final balances
        System.out.println("Balance Anna: $" + service.getBalance("Anna"));
        System.out.println("Balance Lucas: $" + service.getBalance("Lucas"));

    }
}
