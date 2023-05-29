import lombok.AllArgsConstructor;
import  lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pickup extends Transport {

    private LoadCapacity loadCapacity;

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

}
