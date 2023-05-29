import lombok.AllArgsConstructor;
import  lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car extends Transport {
    private BodyType bodyType;

    @Override
    public void  start() {
        System.out.println("Машина поехала");
    }

}
