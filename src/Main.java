public class Main {
    public static void main(String[] args) throws InterruptedException {
        Vehicle_Tester VehicleTester=new VehicleTester();
        System.out.println("testStarting");
        VehicleTester.testStartingBehavior();
        System.out.println("testAcceleration");
        VehicleTester.testAccelerationPerformance();
        System.out.println("testBraking");
        VehicleTester.testBrakingCapabilities();
        System.out.println("testStopping");
        VehicleTester.testStoppingBehavior();
        System.out.println("testPolymorphism");
        VehicleTester.testPolymorphismWithArray();
    }
}
