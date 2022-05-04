public class CheckingPassword {
    private String password;
    private boolean isLength = false;
    private boolean hasSpace = false;
    private boolean hasUppercase = false;
    private boolean hasLowercase = false;
    private boolean hasDigit = false;
    private boolean isLegal = false;

    public CheckingPassword() {
    }

    public CheckingPassword(String password) {
        this.password = password;
        this.isLegal = judgeLegal();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean judgeLegal() {

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
            return true;
        return false;
    }

    @Override
    public String toString() {
        String msg = "";
        if (isLegal)
            msg += "密码有效";
        else {
            
        }
        return msg;
    }

}
