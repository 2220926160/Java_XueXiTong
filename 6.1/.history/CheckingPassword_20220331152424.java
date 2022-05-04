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

    public boolean isLength() {
        return isLength;
    }

    public void setLength(boolean isLength) {
        this.isLength = isLength;
    }

    public boolean isHasSpace() {
        return hasSpace;
    }

    public void setHasSpace(boolean hasSpace) {
        this.hasSpace = hasSpace;
    }

    public boolean isHasUppercase() {
        return hasUppercase;
    }

    public void setHasUppercase(boolean hasUppercase) {
        this.hasUppercase = hasUppercase;
    }

    public boolean isHasLowercase() {
        return hasLowercase;
    }

    public void setHasLowercase(boolean hasLowercase) {
        this.hasLowercase = hasLowercase;
    }

    public boolean isHasDigit() {
        return hasDigit;
    }

    public void setHasDigit(boolean hasDigit) {
        this.hasDigit = hasDigit;
    }

    public boolean isLegal() {
        return isLegal;
    }

    public void setLegal(boolean isLegal) {
        this.isLegal = isLegal;
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
            msg += "密码无效, 原因如下: \n";
            if (!isLength)
                msg += "密码长度不在 8-15 内\n";
            if (hasSpace)
                msg += "密码中有空格\n";
            if (!hasDigit)
                msg += "密码中无数字\n";
            if (!hasUppercase)
                msg += "密码中无大写字母\n";
            if (!hasLowercase)
                msg += "密码中无小写字母";
        }
        return msg;
    }

}
