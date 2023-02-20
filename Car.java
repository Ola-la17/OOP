

// Доработайте класс Car.
// В классе должна храниться следующая информация:
// Свойство - которое говорит заведен авто или нет
// Метод - запуска автомобиля
// Метод - остановки автомобиля
// Метод дороги - при вызове, в качестве аргумента передаем место назначения
// И если авто заведён - выводим, что мы на такой-то авто едем место назначения
// Если не заведён - сообщить, что авто не заведено. И мы не можем ехать



public class Car {

    String model;
    int year;
    double price;
    String color;
    int power;
    boolean status;



    Car(String model, int year, double price, String color, int power) {
        this.model=model;
        this.year=year;
        this.price=price;
        this.color=color;
        this.power=power;
        this.status = false;
        
    }
        
    public void getInfo() {
    System.out.println(model + " " + year + " " + price + " "+ color + " " + power);
}

    public void powerCare() {
    this.status=true;
    System.out.println("Автомобиль заведен");

}

    public void stopCare() {
    this.status=false;
    System.out.println("Автомобиль остановился"); 
    }
       
public void road(String adress){
    if (status==false) {
    System.out.println("Автомобиль не заведен, мы не можем ехать");
}
    else {
    System.out.println("Мы едем по адресу" + adress);

}
    
}


}
    
