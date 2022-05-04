public class CheckingPassword {
    private String password;

    public CheckingPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLegal() {
        for (char c: password.toCharArray()) {

        }
        return false;
    }

    @Override
    public String toString() {
        return "CheckingPassword [password=" + password + "]";
    }

}
