package com.automation.utils;

public class FormQueryMapBuilder extends BaseQueryMapBuilder {

    public FormQueryMapBuilder() {
        super();
    }

    public FormQueryMapBuilder addGrantType(String grantType) {
        putString("grant_type", grantType);
        return this;
    }

    public FormQueryMapBuilder addScope(String scope) {
        putString("scope", scope);
        return this;
    }

    public FormQueryMapBuilder addUserName(String userName) {
        putString("username", userName);
        return this;
    }

    public FormQueryMapBuilder addPassWord(String password) {
        putString("password", password);
        return this;
    }

    // ... Add additional FormQueryMapBuilder ...

}
