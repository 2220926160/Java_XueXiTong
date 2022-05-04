public class Calculate {
    private StringBuffer parameter;
    private StringBuffer operate;
    private double a;
    private double b;

    

    public StringBuffer[] split() {
        StringBuffer[] T = new StringBuffer[3];
        T = parameter.split("(|)|,");
        return T;
    }

    @Override
    public String toString() {
        return "Calculate [a=" + a + ", b=" + b + "]";
    }

}
