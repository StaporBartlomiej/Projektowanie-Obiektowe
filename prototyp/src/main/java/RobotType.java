import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@AllArgsConstructor
public enum RobotType {

    A("A"),
    B("B"),
    C("C");

    @Getter
    String display;

    private static final Map<String, RobotType> values = Stream.of(values())
            .collect(Collectors.toMap(
                    RobotType::getDisplay,
                    Function.identity()
            ));

}
