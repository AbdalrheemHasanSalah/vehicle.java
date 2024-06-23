import java.util.Date;
import java.util.concurrent.TimeUnit;

 class Car extends LandVehicle {
    String model;
    String brand;
   double fuel;



 protected Car(String model,String brand,int wheels_num,double fuel ){
       this.brand=brand;
       this.model=model;
       wheels_number=wheels_num;
       this.fuel= fuel;


   }
   protected Car( ){

    }



    FuelEfficient Fuel=new VehicleFuelCalculator();

    long time_start;
    @Override
    public void starting()  {
        Date start_time= new Date();
        System.out.println("start_time car:"+start_time);
        time_start=   System.currentTimeMillis();
        System.out.println("start_time in Millis: "+time_start);

    }
    @Override
    public void  stopping()  {

        Date end_time= new Date();
        Fuel.Fuel_display(this.fuel);
        System.out.println("end_time car : "+end_time);
        long time_END=   System.currentTimeMillis();
        System.out.println("end_time in Millis car : "+time_END);
        long elapsed_time = time_END - time_start;
        System.out.println("elapsed_time in Millis car : "+elapsed_time);
        Fuel.Fuel_increase(this.fuel);

    }
    @Override
    public void accelerating() throws InterruptedException {

     int speed = (int) (3 + Math.random() * ((10 - 3) + 1));
        Fuel.Fuel_decrease( this.fuel);
        long end =   System.currentTimeMillis()+120000;

        while(System.currentTimeMillis()<=end){
            System.out.println("speed car: "+speed++);
            TimeUnit.SECONDS.sleep(10);
        }

    }

    @Override
    public void braking() throws InterruptedException{

        int rand = (int) (1 + Math.random() );
        TimeUnit.SECONDS.sleep(rand);

        starting();

    }

}
