import java.util.Date;
import java.util.concurrent.TimeUnit;

 class Helicopter extends AirVehicle {
    long time_start;



protected Helicopter( double maneuverability,  double wingspan, double maximum_altitude, double fuel){
        this.maneuverability=maneuverability;
        this.wingspan=wingspan;
        this.maximum_altitude=maximum_altitude;
        this.fuel=fuel;

    }

   protected Helicopter( ){
    }


    FuelEfficient Fuel=new VehicleFuelCalculator();

    @Override
    public void starting()  {
        Date start_time= new Date();

        System.out.println("start_time in Helicopter : "+start_time);

        time_start=   System.currentTimeMillis();
        System.out.println("start_time in Millis Helicopter: "+time_start);

    }

    @Override
    public void stopping()  {

       Date end_time= new Date();
        Fuel.Fuel_display(this.fuel);
        System.out.println("end_time in Helicopter : "+end_time);
       long time_end= System.currentTimeMillis();
        System.out.println("time_end in Millis Helicopter : "+end_time);
        long elapsed_time = time_end - time_start;
        System.out.println("elapsed_time in Millis Helicopter : "+elapsed_time);
        Fuel.Fuel_increase(this.fuel);

    }

    @Override
    public void accelerating() throws InterruptedException {

        rotor_speed = (int) (3 + Math.random() * ((10 - 3) + 1));
        maneuverability=(double)(1+ Math.random() * ((360 - 1) + 1));
        long end =   System.currentTimeMillis()+120000;
        Fuel.Fuel_decrease(this.fuel);

        while(System.currentTimeMillis()<=end){
            System.out.println("rotor_speed Helicopter : "+rotor_speed++);
            TimeUnit.SECONDS.sleep(10);
        }

    }

    @Override
    public void braking() throws InterruptedException{

        int rand = (int) (1 + Math.random() );
        TimeUnit.SECONDS.sleep(rand);
        rotor_speed =0;
        starting();

    }
   int rotor_speed;// km/h
    double maneuverability ;
}
