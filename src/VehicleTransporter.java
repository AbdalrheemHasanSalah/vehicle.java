
interface Transportable{
void  loading(int passengers);
void loading(double cargo_capacity);
void  unloading(int passengers);
void unloading(double  cargo_capacity);
void display(int passengers);
void display(double cargo_capacity);

}



 class VehicleTransporter implements Transportable {
    public void loading(int passengers_number){   passengers_number+=1;
        System.out.println( passengers_number);}

    public void loading(double cargo_capacity) {
        cargo_capacity+=.25;
        System.out.println( cargo_capacity);
    }
    public void unloading(int passengers_number){   passengers_number-=1;
        System.out.println( passengers_number);
    }

    public void unloading(double cargo_capacity) {
        cargo_capacity-=.25;
        System.out.println( cargo_capacity);
    }

    public  void display(int passengers){

        System.out.println( passengers);

    }
    public  void display(double cargo_capacity){

        System.out.println(  cargo_capacity);

    }
}
