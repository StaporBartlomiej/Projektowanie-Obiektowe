package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;

@Value
@Builder
@AllArgsConstructor
public class UserDto {

    int id;
    String name;
    String surname;
    String birthDate;
    BigDecimal fee;
}
