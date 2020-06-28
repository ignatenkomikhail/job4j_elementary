package ru.job4j.bank;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        this.users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = this.findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = this.users.get(user.get());
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
        Optional<User> user = Optional.empty();
        for (User u : this.users.keySet()) {
            if (passport.equals(u.getPassport())) {
                user = Optional.of(u);
                break;
            }
        }
        return user;
        /*return users.keySet().stream()
                .filter(e -> passport.equals(e.getPassport()))
                .findFirst()
                .orElse(null);*/
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<Account> account = Optional.empty();
        Optional<User> user = this.findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = this.users.get(user.get());
            for (Account acc : accounts) {
                if (requisite.equals(acc.getRequisite())) {
                    account = Optional.of(acc);
                    break;
                }
            }
        }
        return account;
        /*User user = this.findByPassport(passport);
        return (user == null) ? null
                : this.users.get(user).stream()
                    .filter(e -> requisite.equals(e.getRequisite()))
                    .findFirst()
                    .orElse(null);*/
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> src = this.findByRequisite(srcPassport, srcRequisite);
        Optional<Account> dest = this.findByRequisite(destPassport, destRequisite);
        if (src.isPresent() && dest.isPresent() && src.get().getBalance() >= amount) {
            dest.get().setBalance(dest.get().getBalance() + amount);
            src.get().setBalance(src.get().getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }
}
