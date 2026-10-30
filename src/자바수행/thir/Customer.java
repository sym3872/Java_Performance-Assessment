package 자바수행.thir;

public class Customer {
    private String name;
    private int reservedSeats = 0;

    public Customer(String name){
        this.name = name;
    }
    public void addReservation(int ad){
        reservedSeats += ad;
    }
    public void showInfo(){
        System.out.println(name + ": " + reservedSeats + "석");
    }
}
