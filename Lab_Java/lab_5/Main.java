import java.io.*;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            String s = br.readLine();
            Pattern pattern = Pattern.compile("[;,]");
            String[] str = pattern.split(s);
            for (int i = 0; i < str.length; i++) {
                bw.write((i+1)+" "+ str[i] + "\n");
            }
            for (int i = 0; i < str.length; i++) {
                if (str[i].matches("[A-H]|(A(m?(\\+|-)|(aug)|(dim-))-H((b5)|(#5)|(5)|(m\\+5)|(m-5)|(-5)|(aug)|(dim)|(\\+5)|(m)))")){
                   bw.write((i+1) + " Музыкальный аккорд"+"\n");
                } else bw.write((i+1) + " Не является музыкальным аккордом"+"\n");
            }
            bw.close();
            br.close();
        } catch (IOException e) {
            System.out.println("error" + e);
        }
    }
}
