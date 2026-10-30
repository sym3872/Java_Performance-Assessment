package 자바수행.sce;

import java.util.Scanner;

public class main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        VendingMachine Machine = new VendingMachine("콜라",1500,10);
        Machine.sell(sc.nextInt());
        Machine.showInfo();
    }
}
