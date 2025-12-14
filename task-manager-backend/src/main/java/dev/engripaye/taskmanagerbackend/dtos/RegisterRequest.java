package dev.engripaye.taskmanagerbackend.dtos;

public class RegisterRequest {

    private String password;
    private String username;

    public RegisterRequest() {
    }

    public RegisterRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

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
}

