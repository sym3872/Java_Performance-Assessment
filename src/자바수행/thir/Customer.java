package 자바수행.thir;

public class Customer {
    private String name;
    private int reservedSeats;;


    public Customer(String name,int reservedSeats){
        this.name = name;
        this.reservedSeats = 0;
    }
    public void addReservation(int ad){
        reservedSeats += ad;
    }
    public void showInfo(){
        System.out.println(name+":  "+reservedSeats);
    }
}
