package ru.itpark.repository;

import ru.itpark.domain.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    private List<Account> accounts = new ArrayList<Account>();
    private int nextId = 1;

    public Account add(Account account) {
        account.setId(nextId++);
        accounts.add(account);
        return account;
    }

    public Account update(Account account) throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    public Account findById(int id) throws IllegalAccessException {
        for (Account account : accounts) {
            if (account.getId() == id) {
                return account;
            }
        }
        throw new IllegalAccessException();
    }

    public void removeById(int id) throws IllegalAccessException {
        throw new IllegalAccessException();
    }
}
