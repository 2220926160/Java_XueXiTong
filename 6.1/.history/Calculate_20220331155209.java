public class Calculate {
    private String parameter;
    private String operate;
    private Double a;
    private Double b;

    public Calculate(String parameter) {
        this.parameter = parameter;
        String[] T = new String[3];
        T = parameter.toString().split("(|)|,");
        try {
            operate = T[0];
            a = Double.parseDouble(T[1]);
            if (!T[2].isEmpty()) {
                b = Double.parseDouble(T[2]);
            } 
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }

    public Calculate(String parameter, String operate, double a, double b) {
        this.parameter = parameter;
        this.operate = operate;
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Calculate [a=" + a + ", b=" + b + "]";
    }

}
