public class Main {

    public static void main(String[] args) {
        RobotManager robotManager = new RobotManager();
        robotManager.addPrototype("A");
        robotManager.addPrototype("B");
        robotManager.addPrototype("C");
        robotManager.addPrototype("D");

        ElectricDevicesFactory factory = new ElectricDevicesFactory(robotManager);
        System.out.println(factory.getProduct(ProductType.TELEWIZOR_MARKI_RETRO_WISLA_3));
        System.out.println(factory.getProduct(ProductType.TOSTER_PNEUMATYCZNY));
        System.out.println(factory.getProduct(ProductType.HYDROKINETYCZNA_OBIERACZKA_DO_BANANOW));
    }
}
