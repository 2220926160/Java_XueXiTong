public class Calculate {
    private String parameter;
    private String operate;
    private Double a;
    private Double b;

    

    public Calculate(String parameter) {
        this.parameter = parameter;
        operate = split()[0];
        a = Double.parseDouble(split()[1]); 
    }

    public Calculate(String parameter, String operate, double a, double b) {
        this.parameter = parameter;
        this.operate = operate;
        this.a = a;
        this.b = b;
    }

    public String[] split() {
        String[] T = new String[3];
        T = parameter.toString().split("(|)|,");
        return T;
    }

    @Override
    public String toString() {
        return "Calculate [a=" + a + ", b=" + b + "]";
    }

}
