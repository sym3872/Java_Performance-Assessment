package 자바수행.thir;

public class Cinema {
    private String title;
    private int availableSeats;

    public Cinema(String title,int availableSeats){
        this.title  = title;
        this.availableSeats = availableSeats;
    }
    public void reserve(Customer  customer,int count){
        if(count <=  0){
            System.out.println("올바른 좌석수를 입력하세요.");
        }
        else if(count>availableSeats){
            System.out.println("좌석이 부족합니다.");
        }
        else if(count > 0 & count <=  availableSeats){
            availableSeats-=count;
            customer.addReservation(count);
        }
    }
    public void showInfo(){
        System.out.println("영화 제목: "+title);
        System.out.println("남은 좌석: "+availableSeats);
    }
}
