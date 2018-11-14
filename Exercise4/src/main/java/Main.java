import deserializer.Deserializer;
import deserializer.DeserializerFactory;
import serializer.Serializer;
import serializer.SerializerFactory;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SomeObject object = new SomeObject("name", "surname",10);
        Serializer jsonSerializer = SerializerFactory.getSerializer("JSON");
        String serializedObject = jsonSerializer.serialize(object);
        System.out.println("Serialized object: " + serializedObject);

        Deserializer jsonDeserializer = DeserializerFactory.getDeserializer("JSON");
        SomeObject deserializedObject = (SomeObject) jsonDeserializer.deserialize(serializedObject);
        System.out.println("Deserialized object: " + deserializedObject.toString());
    }
}
