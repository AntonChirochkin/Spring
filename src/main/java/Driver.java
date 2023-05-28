import org.springframework.beans.factory.annotation.Autowired;

// Создаем класс Driver с полями name и car
public class Driver {

    private String name;
    private Car car;

    // Конструктор с параметрами name и car
    public Driver(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    // Конструктор с параметром name
    public Driver(String name) {
        this.name = name;
    }

    // Теперь прописываем аннотацию @Autowired для метода setCar,
    // который будет использоваться для внедрения зависимости Car
    @Autowired
    public void setCar(Car car) {
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

