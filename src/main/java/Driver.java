public class Driver {
    private String name;
    private Car car;

    public Driver(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public void startTheCar() {
        System.out.println(name + " сел(а) в " + car.getModel());
        car.start();
    }

    @Override
    public String toString() {
        return "Driver{" +
                "car=" + car +
                '}';
    }
}
