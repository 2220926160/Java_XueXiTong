public class Calculate {
    private String parameter;
    private String operate;
    private double a;
    private double b;

    

    public String[] split() {
        String[] T = new String[3];
        T = parameter.toString().split("(|)|,");
        // T = parameter.("(|)|,");
        return T;
    }

    @Override
    public String toString() {
        return "Calculate [a=" + a + ", b=" + b + "]";
    }

}
