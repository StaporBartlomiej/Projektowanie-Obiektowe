import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.Set;

@Value
@Builder
public class KomorkaRoslinna {

    Komorka komorka;
    Set<String> chloroplast;
    String scianaKomorkowa;

}
