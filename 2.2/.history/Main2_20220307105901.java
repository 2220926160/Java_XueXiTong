// 水仙花数字也被称为超完美数字不变量，自恋数字，自我力量数字和阿姆斯特朗数字。水仙花数是指n位数（n≥3），
// 其每个位上的数字之和等于其自身要求（例如：1^3 + 5^3+ 3^3 = 153;1^4+6^4+4^4+4=1634），编写程序来计算n位（3≤n≤7）中的水仙花数量。
// 输入格式：给定一个正整数 n （3≤n≤7）。输出格式：按升序输出所有n位水仙花，每个数字一行。输入示例：下面是一组输入。如：3 输出样本：153 370 371 407
import java.util.*;

public class Main2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int min = (int) Math.pow(10, N - 1);
        int max = (int) Math.pow(10, N);
        ArrayList<Integer> resultArr = new ArrayList<>();
        
        int[] pow = new int[10];
        pow[1] = 1;
        for (int i = 2; i < pow.length; i++) {
            pow[i] = (int)Math.pow(i, N);
        }

        for (int i = min; i < max; i++) {
            int sum = 0;
            for (int j = 10; j < max; j *= 10) {
                sum += pow[i / j % 10];
            }
            sum += pow[i % 10];
            if (sum == i) {
                resultArr.add(i);
            }
        }
        for (Integer i : resultArr) {
        System.out.println(i);
        }
        input.close();
    }
}
