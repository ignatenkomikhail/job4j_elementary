package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        this.users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = this.findByPassport(passport);
        if (user != null) {
            List<Account> accounts = this.users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        /*User user = null;
        for (User u : this.users.keySet()) {
            if (passport.equals(u.getPassport())) {
                user = u;
                break;
            }
        }*/
        List<User> list = users.keySet().stream()
                .filter(e -> passport.equals(e.getPassport()))
                .collect(Collectors.toList());
        return (list != null && list.size() > 0) ? list.get(0) : null;
    }

    public Account findByRequisite(String passport, String requisite) {
        //Account account = null;
        User user = this.findByPassport(passport);
        List<Account> list = null;
        if (user != null) {
            /*List<Account> accounts = this.users.get(user);
            for (Account acc : accounts) {
                if (requisite.equals(acc.getRequisite())) {
                    account = acc;
                    break;
                }
            }*/
            list = this.users.get(user).stream()
                    .filter(e -> requisite.equals(e.getRequisite()))
                    .collect(Collectors.toList());
        }
        return (list != null && list.size() > 0) ? list.get(0) : null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account src = this.findByRequisite(srcPassport, srcRequisite);
        Account dest = this.findByRequisite(destPassport, destRequisite);
        if (src != null && dest != null && src.getBalance() >= amount) {
            dest.setBalance(dest.getBalance() + amount);
            src.setBalance(src.getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }
}
