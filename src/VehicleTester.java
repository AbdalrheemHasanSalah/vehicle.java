interface  Vehicle_Tester{
    void testStartingBehavior();
    void testStoppingBehavior();
    void testAccelerationPerformance() throws InterruptedException;
    void testBrakingCapabilities() throws InterruptedException;
    void  testPolymorphismWithArray() throws InterruptedException;
}
 class VehicleTester  implements Vehicle_Tester {

    Vehicle Car = new Car("hyundai ","Accent",4,78);
     Vehicle Truck = new Truck(14500,2,6, 60);
    Vehicle Airplane = new Airplane( 40, 14000, 80,0);
    Vehicle Helicopter = new Helicopter(50,  16.50, 2500, 70);


    public VehicleTester(){}


    public void testStartingBehavior() {
        Car.starting();
        Truck.starting();
        Airplane.starting();
        Helicopter.starting();
    }
    public void testStoppingBehavior() {
        Car.stopping();
        Truck.stopping();
        Airplane.stopping();
        Helicopter.stopping();

    }

    public void testAccelerationPerformance() throws InterruptedException {
        Car.accelerating();
        Truck.accelerating();
        Airplane.accelerating();
        Helicopter.accelerating();

    }

    public void testBrakingCapabilities() throws InterruptedException {

        Car.braking();
        Truck.braking();
        Airplane.braking();
        Helicopter.braking();

    }

    public void  testPolymorphismWithArray() throws InterruptedException {
        Vehicle []Polymorphism_array={new Car(),new Truck(),new Airplane(),new Helicopter()};
        for(Vehicle Vehicle:Polymorphism_array){
            Vehicle.starting();
            Vehicle.accelerating();
            Vehicle.braking();
            Vehicle.stopping();
        }
    }
}