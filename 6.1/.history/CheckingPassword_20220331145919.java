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
        boolean isLength = false;
        boolean hasSpace = false;
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (!isLength && password.length() >= 8 && password.length() <= 15) {
                isLength = true;
            } else if (!hasSpace && c == ' ') {
                hasSpace = true;
            } else if (!hasDigit && c >= '0' && c <= '9') {
                hasDigit = true;
            } else if (!hasUppercase && c >= 'A' && c <= 'Z') {
                hasUppercase = true;
            } else if (!hasLowercase && c >= 'a' && c <= 'z') {
                hasLowercase = true;
            }
        }
        if (isLength && !hasSpace && hasUppercase && hasLowercase && hasDigit)
            return truel
        return false;
    }

    @Override
    public String toString() {
        return "CheckingPassword [password=" + password + "]";
    }

}
