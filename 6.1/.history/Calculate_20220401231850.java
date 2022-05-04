public class Calculate {
    private String parameter;
    private String operate;
    private Double a;
    private Double b;
    private double result;

    public Calculate(String parameter) {
        this.parameter = parameter;
        String[] T;
        try {
            T = parameter.split("\\(|\\)|,");
            // T = parameter.split("");
            operate = T[0];
            // for (String i : T) {
            //     System.out.println(i);
            // }
            a = Double.parseDouble(T[1]);
            if (!T[2].isEmpty()) {
                b = Double.parseDouble(T[2]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        calculateResult();
    }

    public void calculateResult() {
        if (operate.equals("max")) {
            result = a > b ? a : b;
        } else if (operate.equals("min")) {
            result = a < b ? a : b;
        } else if (operate.equals("sub")) {
            result = a - b;
        } else if (operate.equals("add")) {
            result = a + b;
        } else if (operate.equals("doubleMe")) {
            result *= 2;
        }
    }

    @Override
    public String toString() {
        String msg = "";
        msg += parameter + "=";
        if (result == (int)result) {
            msg += (int)result;
        }
        else {
            msg += result;
        }
        // System.out.println((int)result);
        // System.out.println(result == (int)result ? (int)result : (int)result);
        // System.out.println(result == (int)result ? (int)result : result);
        // System.out.println(result == (int)result ? result : (int)result);
        // msg += result == (int)result ? (int)result : result;
        return msg;
    }

}
