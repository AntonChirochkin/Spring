
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "car")
    public Transport getCarBean() {
        return new Car(BodyType.COUPE);
    }

    @Bean(name = "bus")
    public Transport getBusBean() {
        return new Bus(Size.L);
    }

    @Bean(name = "pickup")
    public Transport getPickupBean() {
        return new Pickup(LoadCapacity.N1);
    }

    @Bean(name = "driver1")
    public Driver getDriver1() { return new Driver("Игорь", getCarBean()); }

    @Bean(name = "driver2")
    public Driver getDriver2() { return new Driver("Владимир", getBusBean()); }

    @Bean(name = "driver3")
    public Driver getDriver3() { return new Driver("Дмитрий", getPickupBean()); }
}
