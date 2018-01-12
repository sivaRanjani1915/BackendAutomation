package com.services.responses.navWebApp.accounts;

import java.util.ArrayList;
import java.util.List;

public class AccountsResponse {

    public static AccountsResponse accountsResponse;

    private List<Account> accounts = new ArrayList();


    public List<Account> getAccounts() {
        return accounts;
    }

    public Account getAccountInfo() {
        return accounts.isEmpty() ? null : accounts.get(0);
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
