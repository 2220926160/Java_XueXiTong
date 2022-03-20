import java.util.*;

public class Driver {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    }
}

class Rectangle {
    private float width; // 宽度
    private float lenth; // 长度

    public Rectangle() {
        this.width = 1.0f;
        this.lenth = 1.0f;
    }

    public Rectangle(float width, float lenth) {
        this.width = width;
        this.lenth = lenth;
    }

    public float calculateArea() {
        return width * lenth;
    }

    public float calculateCircumference() {
        return (width + lenth) * 2;
    }

    @Override
    public String toString() {
        return "矩形 [长度:" + lenth + ", 宽度:" + width + ", 面积:" + calculateArea() + ", 周长:" + calculateCircumference() + "]";
    }
    
}