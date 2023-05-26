import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Car getCarBean() {
        return new Car("BMW");
    }

    @Bean(name = "driver")
    public Driver getDriver() {
        return new Driver("Вася" , getCarBean());
    }
}
