public class ElectricDevicesFactory {

    private final RobotManager manager;

    public ElectricDevicesFactory(RobotManager manager) {
        this.manager = manager;
    }

    public String getProduct(ProductType productType) {
        if (productType.equals(ProductType.TELEWIZOR_MARKI_RETRO_WISLA_3)) {
            Robot robotA = manager.getCopy("A");
            Robot robotB = manager.getCopy("B");
            Robot robotC = manager.getCopy("C");
            return robotA.build() + robotA.build() + robotA.build() + robotB.build() + robotB.build() + robotC.build();
        }
        return ProductType.getValue(productType);

    }

}
