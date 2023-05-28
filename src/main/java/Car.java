public class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public void  start() {
        System.out.println(model + " заведена");
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
