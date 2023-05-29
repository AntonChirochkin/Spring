import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Driver {

    private String name;
    private Transport transport;


    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public void startTheCar() {
        System.out.println(name + " сел(а) в " + transport);
        transport.start();
    }

    @PostConstruct
    private void init() {
        System.out.println("Водитель online");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Водитель offline");
    }


    @Override
    public String toString() {
        return "Driver " +
                "имя - " + name +
                " транспорт - " + transport;
    }
}

