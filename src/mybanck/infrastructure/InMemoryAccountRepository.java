package mybanck.infrastructure;

import mybanck.account.Account;
import mybanck.account.AccountRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryAccountRepository implements AccountRepository {

    // Database
    private List<Account> accounts = new ArrayList<>();

    @Override
    public void save(Account account){
        accounts.add(account);
    }

    @Override
    public Account findByOwner(String owner){
        return accounts.stream()
                .filter(a -> a.getOwner().equals(owner))
                .findFirst().orElse(null);
    }
}
