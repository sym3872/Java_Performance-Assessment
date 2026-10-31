package 자바수행.four;

public class Car  {
    private static int serialNum =101;
    private int num;
    private String carNumber;
    private String carType;
    private int dailyPrice;
    private boolean  rented;

    public Car(String carNumber,String carType,int dailyPrice){
        this.carNumber = carNumber;
        this.carType = carType;
        this.dailyPrice = dailyPrice;
        serialNum = num++;
    }
    public int rent(int  day){
        rented = true;
       return dailyPrice*day;
    }
    public void  showInfo(){
        System.out.println("관리번호: "+num);
        System.out.println("차량번호: "+carNumber);
        System.out.println("차종:  "+carType);
        System.out.println("1일  대여 요금: "+dailyPrice);
        System.out.println("대여 여부:  "+rented);
    }

}
