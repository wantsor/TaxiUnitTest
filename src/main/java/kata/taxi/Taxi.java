package kata.taxi;

public class Taxi {

    public static final double START_PRICE = 6;
    public static final int START_DISTANCE = 2;
    public static final int LONG_DISTANCE = 8;
    public static final double PRICE_BETWEEN_2_8 = 0.8;
    public static final double PRICE_GREATER_THAN_8 = 1.5;
    public static final double PRICE_WAITING = 0.25;

    public Taxi(int distance, int time) {

    }

    public static double calculate(int distance, int time) {

        double charge = 0;

        if (distance <= START_DISTANCE) {
            charge = START_PRICE;
        } else if (distance <= LONG_DISTANCE) {
            charge = (distance - START_DISTANCE) * PRICE_BETWEEN_2_8 + START_PRICE;
        } else {
            charge = calculate(LONG_DISTANCE,0) + (distance - LONG_DISTANCE) * PRICE_BETWEEN_2_8 * PRICE_GREATER_THAN_8;
        }

        charge = charge + time * PRICE_WAITING;
        return charge;
    }

    public static  double calculate(int distance){
        return calculate(distance,0);
    }

}
