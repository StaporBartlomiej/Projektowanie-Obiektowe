import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RobotA implements Robot {

    private String module;

    @Override
    public String build() {
        return module;
    }

    @Override
    public Robot clone() {
        return new RobotA(this.module);
    }
}
