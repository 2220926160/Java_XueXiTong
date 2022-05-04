public class Calculate {
    private String parameter;
    private String operate;
    private Double a;
    private Double b;
    private Double result;

    public Calculate(String parameter) {
        this.parameter = parameter;
        String[] T = new String[3];
        try {
            T = parameter.toString().split("(|)|,");
            operate = T[0];
            a = Double.parseDouble(T[1]);
            if (!T[2].isEmpty()) {
                b = Double.parseDouble(T[2]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void calculateResult() {
        if (operate.equals("max")) {
            result = a > b ? a : b;
        }
        else if (operate.equals("min")) {
            result = a < b ? a : b;
        }
        else if (operate.equals("sub")) {
            result = a - b;
        }
        else if (operate.equals("add")) {
            result = a + b;
        }
    }

    @Override
    public String toString() {
        return "Calculate [a=" + a + ", b=" + b + "]";
    }

}
