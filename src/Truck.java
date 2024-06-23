import java.util.Date;
import java.util.concurrent.TimeUnit;

 class Truck extends LandVehicle{
    double  cargo_capacity;//in Tun


    protected Truck(int towing_capacity,double  cargo_capacit,int wheels_num, double Fuel){
      this.towing_capacity=towing_capacity;
        this.cargo_capacity=cargo_capacit;
       wheels_number= wheels_num;
         fuel=  Fuel;

    }
    protected   Truck(){

    }

    Transportable Transporter=new  VehicleTransporter();

    FuelEfficient Fuel=new VehicleFuelCalculator();
    int towing_capacity;
    long time_start;
    @Override
    public void starting() {
      Date start_time= new Date();
        Transporter.loading(cargo_capacity);
        Transporter.display(cargo_capacity);
        System.out.println("start_time in Truck :"+start_time);

        time_start=   System.currentTimeMillis();
        System.out.println("start_time in Millis: "+time_start);

    }


    @Override
    public void stopping() {

       Date end_time= new Date();
        Fuel.Fuel_display(this.fuel);
        Transporter.unloading(cargo_capacity);
        System.out.println("time_end in Truck: "+end_time);
        long time_end=System.currentTimeMillis();
        System.out.println("time_end in Millis: "+time_end);
        long elapsed_time = time_end - time_start;
        System.out.println("elapsed_time in Truck: "+elapsed_time);
Fuel.Fuel_increase(this.fuel);
    }
    @Override
    public void accelerating()throws InterruptedException {

        towing_capacity = (int) (3 + Math.random() * ((10 - 3) + 1));
        long end =   System.currentTimeMillis()+120000;
        Fuel.Fuel_decrease(this.fuel);
        while(System.currentTimeMillis()<=end){
            System.out.println("Truck towing_capacity : "+towing_capacity++);
            TimeUnit.SECONDS.sleep(10);
        }

    }

    @Override
    public void braking()throws InterruptedException{

        int rand = (int) (1 + Math.random() );
        TimeUnit.SECONDS.sleep(rand);
        towing_capacity =0;
        starting();

    }
}
