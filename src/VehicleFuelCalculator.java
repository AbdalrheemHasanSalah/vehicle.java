
interface FuelEfficient{

   void Fuel_increase(double fuel);
    void Fuel_decrease(double fuel);

    void Fuel_display(double fuel);



}





 class VehicleFuelCalculator implements FuelEfficient{
   public void Fuel_increase(double fuel){
       int i = 0;
       while (fuel <= 100) {
           fuel += i*(.1 + Math.random() * ((10 - .1) + 1));
           System.out.println(fuel);
           i++;
       }

   }
   public void Fuel_decrease(double fuel){
       int i = 0;
       while (fuel >=100) {
           fuel -= i*(.1 + Math.random() * ((10 - .1) + 1));
           System.out.println(fuel);
           i++;
       }

   }



   public void Fuel_display(double fuel){

System.out.println(fuel);

   }

}
