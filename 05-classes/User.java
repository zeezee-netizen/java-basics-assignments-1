package classes;

public class User {
    public String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean canLogin(String inputPwd) {
        return this.password.equals(inputPwd);
    }
}
