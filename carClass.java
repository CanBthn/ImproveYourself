public class carClass {
    public String color;
    public int year;
    public int doorNumber;
    private String costumer;
    private int price;
    private int stock;

    public void setCostumer (String costumer){
        this.costumer = costumer;
    }
    public String getCostumer(){
        return this.costumer;
    }
    public void setPrice (int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public int getStock(){
        if(stock < 0){
            System.out.println("YOU CAN NOT BUY THİS CAR");
        }
        return stock;
    }
}