package 자바수행.fir;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle(sc.nextInt(), sc.nextInt());
        rec.showInfo();
    }
}
