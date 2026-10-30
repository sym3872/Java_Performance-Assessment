package 자바수행.sce;

public class VendingMachine {
    private  String name;
    private int price;
    private int stock;

    public VendingMachine(String name,int price,int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public void sell(int buyco){
        if(buyco>0 & buyco<=stock){
            stock -= buyco;
        }
        else{
            System.out.println("음료를 판매할수없습니다.");
        }
    }
    public void showInfo(){
        System.out.println("==판매 후==");
        System.out.println("이름:  "+name);
        System.out.println("가격: "+price);
        System.out.println("남은 재고량:  "+stock+"개");
    }
}
