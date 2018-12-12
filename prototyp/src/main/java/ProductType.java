import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@AllArgsConstructor
public enum ProductType {
    TELEWIZOR_MARKI_RETRO_WISLA_3("something"),
    TOSTER_PNEUMATYCZNY("ABBBAD"),
    HYDROKINETYCZNA_OBIERACZKA_DO_BANANOW("CDAD");

    private static final Map<ProductType, String> values = Stream.of(values())
            .collect(Collectors.toMap(
                    p -> p,
                    ProductType::getProduct
            ));

    @Getter
    private String product;

    public static String getValue(ProductType value) {
        return Optional.ofNullable(values.get(value)).orElseThrow(() -> new IllegalArgumentException("There is no such product"));
    }
}
