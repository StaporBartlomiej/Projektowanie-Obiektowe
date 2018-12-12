import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class RobotManager {

    Map<String, Robot> prototypes = new HashMap<String, Robot>();

    public void addPrototype(String module) { prototypes.putIfAbsent(module, new RobotA(module)); }

    public void deletePrototype(String module) { prototypes.remove(module);}

    public Robot getCopy(String module) { return Optional.ofNullable(prototypes.get(module)).orElseThrow(() -> new IllegalArgumentException("Required prototype does not exist")).clone();}
}
