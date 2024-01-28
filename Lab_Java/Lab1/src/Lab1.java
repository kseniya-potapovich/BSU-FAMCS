import java.util.Scanner;

class Suma {
    static double doubleSeries(double x, double k) {
        double sum = 0;
        double temp = 1;
        double e = Math.pow(10, (-1.0) * k);
        int i = 0;
        do {
            sum = sum + temp;
            //System.out.println("sum= "+sum);
            i++;
            temp = temp * (-1.0) * x * x / (2 * i * (2 * i - 1));
            //System.out.println("temp= "+temp);
        }
        while (Math.abs(temp) > e);
        return sum;
    }

}

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите х ");
        double x = scanner.nextDouble();
        System.out.println("ведите k ");
        int k = scanner.nextInt();
        double r = Suma.doubleSeries(x, k);
        System.out.println("sum= " + r);
        System.out.println("cos= " + Math.cos(x));
        //double w;
        r -= Math.cos(x);
        System.out.println("r= " + r);
    }

}
