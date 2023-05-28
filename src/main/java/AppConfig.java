
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Создаем класс AppConfig, который будет содержать
// конфигурацию бинов для внедрения зависимостей
@Configuration
public class AppConfig {

    // Создаем бин Car с моделью "BMW"
    @Bean
    public Car getCarBean() {
        return new Car("BMW");
    }

    // Создаем бин Driver с именем "Вася"
    @Bean(name = "driver")
    public Driver getDriver() {
        return new Driver("Вася");
    }
}
