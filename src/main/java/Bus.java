import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bus extends Transport {
    private Size size;

    @Override
    public void start() {
        System.out.println("Автобус поехал");
    }
}
