public class carClasses {
    public static void main(String[] args){
        carClass car = new carClass();
        car.color = "BLACK";
        car.doorNumber = 5;
        car.year = 2023;
        car.setCostumer("Batuhan");
        car.setPrice(1000000);
        car.setStock(-1);

        
        System.out.println("Car Color Is " + car.color + "\nCar Year Is " + car.year + "\nCar Door Number Is " + car.doorNumber);
        System.out.println(car.getCostumer());
        System.out.println(car.getPrice());
        System.out.println("STOCK İS " + car.getStock());
    }
}