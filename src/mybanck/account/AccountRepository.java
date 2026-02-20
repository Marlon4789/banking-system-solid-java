package mybanck.account;

public interface AccountRepository {

    void save(Account account);

    Account findByOwner(String owner);
}
