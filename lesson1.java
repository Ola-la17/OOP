import java.util.LinkedList;

public class lesson1 {
        public static void main(String[] args) {
            String[] models = {"Skoda", "Reno", "Volvo",  "Mazda", "Lamborgini", "BMW"};
            String[] colors = {"Green", "Grey", "Yellow", "White", "Dark Blue",  "Gold"};
            double[] engines = {1.0, 1.4, 2.0, 2.4, 2.6, 2.8};
            Random random = new random();
            LinkedList<Car> listCars = new LinkedList<>();
            for (int i = 0; i < 15; i++) {
                Car car = new Car(
                        models[random.nextInt(0, models.length)],
                        Random random.nextInt(2001, 2022).
                        random.nextInt(500000, 5900000),
                        colors[random.nextInt(0, colors.length)],
                        engines[random.nextInt(0, engines.length)],
                        random.nextInt(50, 200),
                        random.nextInt(1587, 2001)
                );
                listCars.add(car);
            }
                System.out.println("Список участников: ");
            for (Car listCar : listCars) {
                System.out.println(listCar.toString());
            }
        }
    }