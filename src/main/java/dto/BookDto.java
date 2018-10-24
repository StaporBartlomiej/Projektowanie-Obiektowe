package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor
public class BookDto {

    int id;
    String title;
    String author;
    int userId;
}
