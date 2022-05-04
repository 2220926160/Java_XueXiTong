public class Calculate<typeA, typeB> {
    private String operate;
    private typeA a;
    private typeB b;

    public Calculate(typeA a) {
        this.a = a;
    }

    public Calculate(typeA a, typeB b) {
        this.a = a;
        this.b = b;
    }

    public typeA getA() {
        return a;
    }

    public void setA(typeA a) {
        this.a = a;
    }

    public typeB getB() {
        return b;
    }

    public void setB(typeB b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Calculate [a=" + a + ", b=" + b + "]";
    }

}
