package 자바수행.four;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Car> cars  =  new ArrayList<>();
        cars.add(new Car("123하  4567","tesla",100000));
        cars.add(new Car("555허 4678","sonata",70000));
        cars.add(new Car("123gh 4567","genesis",90000));

        int totalPrice = 0;
        int choice = sc.nextInt();
        int day = sc.nextInt();

        if(choice > 3){
            System.out.println("잘못된 입력입니다");
        }
        else{
            totalPrice = cars.get(choice-1).rent(day);
        }
        System.out.println("대여 차량(1.teslar, 2.sonata, 3.genesis)와 대여일수를 입력하세요.");
        for(Car car : cars){
            car.showInfo();
        }
        System.out.println("총 금액: "+totalPrice);
        sc.close();
    }
}
