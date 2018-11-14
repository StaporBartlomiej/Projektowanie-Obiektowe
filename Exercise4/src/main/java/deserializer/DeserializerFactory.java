package deserializer;

import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.Optional;

public class DeserializerFactory {

    private static final Map<String, Deserializer> map = ImmutableMap.of(
            "JSON", new JSONDeserializer(),
            "CSV", new CSVDeserializer(),
            "XML", new XMLDeserializer()
    );

    public static Deserializer getDeserializer(String deserializer) {
        return Optional.ofNullable(map.get(deserializer)).orElseThrow(() -> new IllegalArgumentException("Wrong deserializer: : " + deserializer));
    }
}
