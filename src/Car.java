public class Car {
    public static void main(String[] args) {
        String make; //марка
        String model; //модель
        String color; //цвет
        int distance; // расстояние
        int weight; //масса
        boolean dtp; //дтп
        int volume; // объем бензобака
        String engine;// двигатель автомобиля

        System.out.println("БИИИИП");

        Engine d = new Engine();
        int benz = d.getFuelCons()*distance;
        System.out.print(benz + " литров бензина израсходовано за "+ d.getFuelCons() + " км пути");
        }
    }



