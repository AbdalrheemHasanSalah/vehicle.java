import java.util.Date;
import java.util.concurrent.TimeUnit;

 class Airplane extends AirVehicle{





     protected  Airplane( double wingspan, double maximum_altitude, double fuel,  int passenger_capacity){
        this.wingspan=wingspan;
        this.maximum_altitude=maximum_altitude;
        this.fuel=fuel;
        this.passenger_capacity=passenger_capacity;
    }

   protected Airplane( ){}

    Transportable Transporter=new  VehicleTransporter();

    FuelEfficient Fuel=new VehicleFuelCalculator();
    @Override
    public void accelerating() throws InterruptedException {

        cruising_speed = (int) (3 + Math.random() * ((10 - 3) + 1));
        Fuel.Fuel_decrease( this.fuel);
       long end =   System.currentTimeMillis()+120000;
        
        while(System.currentTimeMillis()<=end){
            System.out.println("cruising_speed of Airplane : "+cruising_speed++);
            TimeUnit.SECONDS.sleep(10);
        }

    }
    @Override
    public void starting() {
       Date start_time= new Date();

        System.out.println("start_time Airplane : "+start_time);
        Transporter.loading(passenger_capacity);
        Transporter.display(passenger_capacity);
        time_start=   System.currentTimeMillis();
        System.out.println("start_time in Millis: "+time_start);

    }

    @Override
    public void stopping()  {

      Date TIME_end= new Date();
        Fuel.Fuel_display(this.fuel);
        System.out.println("end_time Airplane : "+ TIME_end);
        Transporter.unloading(passenger_capacity);
       long end_time =  System.currentTimeMillis();
        System.out.println("end_time in Millis Airplane : "+ end_time);
        long elapsed_time = end_time - time_start;
        System.out.println("elapsed_time in Millis Airplane : "+elapsed_time);
        Fuel.Fuel_increase(this.fuel);

    }




    @Override
    public void braking() throws InterruptedException{

        int rand = (int) (1 + Math.random() );
        TimeUnit.SECONDS.sleep(rand);
        cruising_speed =0;
        starting();


    }
    long time_start;
    int passenger_capacity;
    int cruising_speed;//In Kilometres per hour
}
