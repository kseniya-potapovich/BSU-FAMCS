import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

class Suma {
    static BigDecimal bigDecimalSeries(BigDecimal x, int k) {
        BigDecimal temp = new BigDecimal(1);
        BigDecimal sum = new BigDecimal(0);
        BigDecimal e = new BigDecimal(Math.pow(10, -1 * k));
        BigDecimal w = new BigDecimal(-1);
        int i = 0;
        do {
            sum = sum.add(temp);
            i++;
            temp = temp.multiply(x).multiply(x).multiply(w).divide(BigDecimal.valueOf(2 * i * (2 * i - 1)), RoundingMode.HALF_UP);
        }
        while (temp.abs().compareTo(e) > 0);
        return sum;
    }
}

public class Lab1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите x ");
        BigDecimal x = scanner.nextBigDecimal();
        System.out.println("введите k");
        int k = scanner.nextInt();
        System.out.println("sum= " + Suma.bigDecimalSeries(x, k));
        BigDecimal cosX = new BigDecimal(Math.cos(x.doubleValue()));
        System.out.println("cos= " + cosX);
        BigDecimal r;
        r = Suma.bigDecimalSeries(x, k).subtract(cosX);
        System.out.println("r= " + r);
    }
}

