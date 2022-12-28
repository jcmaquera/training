package ActivityConstructor;

public class Main {


    static Cars getCars() {
        Cars cars = new Cars(5, 2);

        return cars;
    }

    public static void main(String[] args) {
        Cars cars = getCars();

        while(!cars.isBatteryDrained()) {
            cars.Drive();
        }

    }


}
