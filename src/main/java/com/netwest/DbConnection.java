package com.netwest;

public class DbConnection {
    String username;
    String passward;

    public DbConnection() {
    }

    public DbConnection(String username, String passward) {
        this.username = username;
        this.passward = passward;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }
}
