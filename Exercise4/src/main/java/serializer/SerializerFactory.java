package serializer;

import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.Optional;

public class SerializerFactory {

    private static final Map<String, Serializer> map = ImmutableMap.of(
            "JSON", new JSONSerializer(),
            "XML", new XMLSerializer(),
            "CSV", new CSVSerializer()
    );
    public static Serializer getSerializer(String serializer) {
        return Optional.ofNullable(map.get(serializer)).orElseThrow(() -> new IllegalArgumentException("Wrong serializer: : " + serializer));
    }
}
