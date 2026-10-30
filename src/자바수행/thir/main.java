package 자바수행.thir;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cinema cinema = new Cinema("어벤져스", 10);
        Customer cus = new Customer("홍길동");
        Customer cus1 = new Customer("김철수");

        int hong = sc.nextInt();
        cinema.reserve(cus, hong);

        int kim = sc.nextInt();
        cinema.reserve(cus1, kim);

        System.out.println("==예약 결과==");
        cus.showInfo();
        cus1.showInfo();
        cinema.showInfo();

        sc.close();
    }
}
