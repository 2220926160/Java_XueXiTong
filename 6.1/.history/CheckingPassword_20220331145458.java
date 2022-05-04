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
        boolean isDigit = false;
        boolean hasSpace = false;
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        for (char c: password.toCharArray()) {
            if (!isDigit &&  c >= '0' && c <= '9') {

            }
            else if (c == ' ') {
                hasSpace = true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "CheckingPassword [password=" + password + "]";
    }

}
