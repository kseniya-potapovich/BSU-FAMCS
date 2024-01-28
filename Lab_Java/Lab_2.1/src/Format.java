import java.util.Formatter;
import java.util.*;
import java.util.Scanner;

class Suma {
    static double doubleSeries(double x, double k) {
        double sum = 0;
        double temp = 1;
        double e = Math.pow(10, (-1.0) * k);
        int i = 0;
        do {
            sum = sum + temp;
            i++;
            temp = temp * (-1.0) * x * x / (2 * i * (2 * i - 1));
        }
        while (Math.abs(temp) > e);
        return sum;
    }

}

public class Format {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите x");
        double x = scanner.nextDouble();
        System.out.println("введите k");
        int k = scanner.nextInt();
        double z = Suma.doubleSeries(x, k);
        System.out.println("cosX= " + z);

        System.out.println("целые значения в восьмеричном и шестнадцатеричном виде");
        Formatter fr = new Formatter();
        fr.format("%o", k);
        System.out.println(fr);
        fr.format("%x", k);
        System.out.println(fr);

        System.out.println("положительные и отрицательные значения с плавающей точкой");
        Formatter formatter1 = new Formatter();
        formatter1.format("%f", z);
        System.out.println(formatter1);

        Formatter formatter22 = new Formatter();
        formatter22.format("%f", x);
        System.out.println(formatter22);

        System.out.println(" спецификатор минимальной ширины поля");
        Formatter formatter2 = new Formatter();
        formatter2.format("%09f", z);
        System.out.println(formatter2);

        Formatter formatter00=new Formatter();
        formatter00.format("%010f",x);
        System.out.println(formatter00);

        Formatter formatter01=new Formatter();
        formatter01.format("%08d",k);
        System.out.println(formatter01);

        System.out.println("спецификатор точности");
        Formatter formatter3 = new Formatter();
        formatter3.format("%5.4f", z);
        System.out.println(formatter3);

        Formatter formatter0=new Formatter();
        formatter0.format("%3.1f",x);
        System.out.println(formatter0);

        System.out.println("флаг +");
        Formatter formatter = new Formatter();
        formatter.format("%+d", k);
        System.out.println(formatter);

        Formatter formatter44 = new Formatter();
        formatter44.format("%+f", z);
        System.out.println(formatter44);

        Formatter formatter11 = new Formatter();
        formatter11.format("%+f", x);
        System.out.println(formatter11);

        System.out.println("флаг ,");
        Formatter formatter4 = new Formatter();
        formatter4.format("-----%,.2f", z*10000000
        );
        System.out.println(formatter4);

        Formatter formatter55 = new Formatter();
        formatter55.format("%,.2f", x);
        System.out.println(formatter55);

        System.out.println("флаг 0");
        Formatter formatter5 = new Formatter();
        formatter5.format("% f0", x);
        System.out.println(formatter5);

        Formatter formatter6 = new Formatter();
        formatter6.format("% f0", z);
        System.out.println(formatter6);

        System.out.println("флаг )");
        Formatter formatter7 = new Formatter();
        formatter7.format("% (d", k);
        System.out.println(formatter7);

        Formatter formatter12 = new Formatter();
        formatter12.format("% (f", z);
        System.out.println(formatter12);

        Formatter formatter13 = new Formatter();
        formatter13.format("% (f", x);
        System.out.println(formatter13);

        System.out.println("флаг #");
        Formatter formatter8 = new Formatter();
        formatter8.format("% #f", z);
        System.out.println(formatter8);

        Formatter formatter9 = new Formatter();
        formatter9.format("% #f", x);
        System.out.println(formatter9);

        System.out.println("использование порядкого номера элемента");
        Formatter formatter10 = new Formatter();
        formatter10.format("%2$f %1$d %3$f", k, x, z);
        System.out.println(formatter10);
    }
}
