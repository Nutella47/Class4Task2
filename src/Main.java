public class Main {

    public static void main(String[] args) {
        Car car = new Car("Camry", "Toyota", 2024, 40000, "red", 10);
        System.out.println(car.toString());

        System.out.println("Selling car");
        car.sell();
        System.out.println("model " + car.getModel());
        System.out.println("brand " + car.getBrand());
        System.out.println("year " + car.getYear());
        System.out.println("price " + car.getPrice());
        System.out.println("color " + car.getColor());
        System.out.println("quantity " + car.getQuantity());

        System.out.println();
        car.setBrand("Range Rover");
        car.setYear(2023);
        System.out.println(car.toString());
    }
}
