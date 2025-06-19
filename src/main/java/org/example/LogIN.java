package org.example;


public class LogIN {

    private String password;
    private String username;

    public LogIN(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public LogIN() {}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}