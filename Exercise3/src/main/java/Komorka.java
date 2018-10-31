import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.Set;

@Value
@Builder
public class Komorka {

    Set<String> blonaKomorkowa;
    String jadroKomorkowe;
    Set<String> blonaJadrowa;
    Set<String> cytoplazma;
    Set<String> retikulumEndoplazmatyczne;
    Set<String> rybosom;
    Set<String> mitochondrium;
    Set<String> wakuola;
    Set<String> lizosom;

}
