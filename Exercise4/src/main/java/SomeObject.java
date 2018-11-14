import lombok.Value;

import java.io.Serializable;

@Value
public class SomeObject implements Serializable {

    String name;
    String surname;
    Integer age;
}
