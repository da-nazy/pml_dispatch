package com.pml_dispatch.api;

public class staffLoginRespons {
    final String type;
    final String email;
    final String password;

    public staffLoginRespons(String type, String email, String password) {
        this.type = type;
        this.email = email;
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
