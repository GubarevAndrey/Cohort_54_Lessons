package less27.HW.task2;

public enum PasswordName {
    PASSWORD("abcd");

    private String password;

    PasswordName(String password) {
        this.password = password;
    }

    public boolean isPassValid(String inPass) {
        return this.password.equals(inPass);
    }
}
